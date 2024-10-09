package com.wskh.entitys;

import java.util.List;

/**
 * @Author：WSKH
 * @ClassName：Instance
 * @ClassType：
 * @Description：实例对象
 * @Date：2022/11/6/21:10
 * @Email：1187560563@qq.com
 * @Blog：https://blog.csdn.net/weixin_51545953?type=blog
 */
public class Instance {

    // 边界的宽
    private double W;
    // 边界的高
    private double H;
    // 矩形列表
    private List<Item> itemList;
    // 是否允许矩形旋转
    private boolean isRotateEnable;

    public double getW() {
        return W;
    }

    public void setW(double w) {
        W = w;
    }

    public double getH() {
        return H;
    }

    public void setH(double h) {
        H = h;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public boolean isRotateEnable() {
        return isRotateEnable;
    }

    public void setRotateEnable(boolean rotateEnable) {
        isRotateEnable = rotateEnable;
    }
}