package cn.xor7.xiaohei.mcmememerge

import com.wskh.entitys.Instance
import com.wskh.entitys.Item
import com.wskh.model.skyline.SkyLinePacking
import java.awt.Color
import java.awt.image.BufferedImage
import java.awt.image.renderable.RenderedImageFactory
import java.io.File
import java.util.UUID
import javax.imageio.ImageIO
import kotlin.math.max

val imageMap = mutableMapOf<String, BufferedImage>()
val uuidMap = mutableMapOf<BufferedImage, String>()


fun main() {
    getGroups().forEach { group ->
        val solution = group.getImages().calcSolution()
        var totalWidth = 0.0
        solution.placeItemList.forEach {
            totalWidth = max(totalWidth, it.y + it.h) // yeah, it's correct
        }
        val resultImage = BufferedImage(
            totalWidth.toInt(),
            1440,
            BufferedImage.TYPE_INT_ARGB
        )
        val graphics = resultImage.createGraphics()
        solution.placeItemList.forEach {
            val image = imageMap[it.name]
            graphics.drawImage(
                image,
                it.y.toInt(),
                it.x.toInt(),
                Color.WHITE,
                null
            )
        }
        ImageIO.write(
            resultImage,
            "PNG",
            File("./result/${group.name}.png").apply {
                mkdirs()
                delete()
                createNewFile()
            })
    }
}

fun getGroups(): List<File> =
    File("./images")
        .takeIf { it.isDirectory }
        ?.listFiles()?.toList()
        ?: emptyList()

fun File.getImages(): List<BufferedImage> =
    takeIf { it.isDirectory }
        ?.listFiles()?.map {
            val image = ImageIO.read(it)
            val uuid = UUID.nameUUIDFromBytes(it.absolutePath.toByteArray()).toString()
            imageMap[uuid] = image
            uuidMap[image] = uuid
            image
        }
        ?: emptyList()

fun List<BufferedImage>.calcSolution() = Instance().apply {
    w = 1440.0
    isRotateEnable = false
    itemList = mutableListOf<Item>()
    var nowArea = 0.0
    forEach { image ->
        val width = image.height // yes, it's correct
        val height = image.width
        nowArea += width * height
        itemList.add(
            Item(
                uuidMap[image],
                width.toDouble(),
                height.toDouble()
            )
        )
    }
    h = nowArea / w * 1.5
}.calcSkyLineSolution()

fun Instance.calcSkyLineSolution() = SkyLinePacking(
    isRotateEnable, w, h, itemList.toTypedArray()
).packing()