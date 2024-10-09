package com.wskh.entitys;

/**
 * @Author：WSKH
 * @ClassName：SkyLine
 * @ClassType：
 * @Description：天际线对象
 * @Date：2022/11/6/19:55
 * @Email：1187560563@qq.com
 * @Blog：https://blog.csdn.net/weixin_51545953?type=blog
 */
public class SkyLine implements Comparable<SkyLine> {

    // 天际线左端点x坐标
    private double x;
    // 天际线左端点y坐标
    private double y;
    // 天际线长度
    private double len;

    // 构造函数
    public SkyLine(double x, double y, double len) {
        this.x = x;
        this.y = y;
        this.len = len;
    }

    // 天际线排序规则，y越小越优先，y一样时，x越小越优先
    @Override
    public int compareTo(SkyLine o) {
        int c1 = Double.compare(y, o.y);
        return c1 == 0 ? Double.compare(x, o.x) : c1;
    }

    // 重写ToString方法，方便打印查看天际线
    @Override
    public String toString() {
        return "SkyLine{" +
                "x=" + x +
                ", y=" + y +
                ", len=" + len +
                '}';
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

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

}