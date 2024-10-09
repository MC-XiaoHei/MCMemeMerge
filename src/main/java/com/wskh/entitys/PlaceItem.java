package com.wskh.entitys;

/**
 * @Author：WSKH
 * @ClassName：PlaceItem
 * @ClassType：
 * @Description：已放置矩形对象
 * @Date：2022/11/6/20:06
 * @Email：1187560563@qq.com
 * @Blog：https://blog.csdn.net/weixin_51545953?type=blog
 */
public class PlaceItem {

    // 名字
    private String name;
    // x坐标
    private double x;
    // y坐标
    private double y;
    // 宽（考虑旋转后的）
    private double w;
    // 高（考虑旋转后的）
    private double h;
    // 是否旋转
    private boolean isRotate;

    // 构造函数
    public PlaceItem(String name, double x, double y, double w, double h, boolean isRotate) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.isRotate = isRotate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public boolean isRotate() {
        return isRotate;
    }

    public void setRotate(boolean rotate) {
        isRotate = rotate;
    }
}