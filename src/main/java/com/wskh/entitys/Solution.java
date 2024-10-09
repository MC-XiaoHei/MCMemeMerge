package com.wskh.entitys;

import java.util.List;

/**
 * @Author：WSKH
 * @ClassName：Solution
 * @ClassType：
 * @Description：装箱结果类
 * @Date：2022/11/7/11:53
 * @Email：1187560563@qq.com
 * @Blog：https://blog.csdn.net/weixin_51545953?type=blog
 */
public class Solution {

    // 已放置矩形
    private List<PlaceItem> placeItemList;
    // 放置总面积
    private double totalS;
    // 利用率
    private double rate;

    // 构造函数
    public Solution(List<PlaceItem> placeItemList, double totalS, double rate) {
        this.placeItemList = placeItemList;
        this.totalS = totalS;
        this.rate = rate;
    }

    public List<PlaceItem> getPlaceItemList() {
        return placeItemList;
    }

    public void setPlaceItemList(List<PlaceItem> placeItemList) {
        this.placeItemList = placeItemList;
    }

    public double getTotalS() {
        return totalS;
    }

    public void setTotalS(double totalS) {
        this.totalS = totalS;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}