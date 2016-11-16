package org.gyt.aaric;

/**
 * 第一次作业
 * - 计算长方形的面积和周长
 * Created by y27chen on 2016/11/16.
 */
public class Rectangle {

    private double width;

    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(String.format("长方形的面积为:%.2f", rectangle.getArea()));
        System.out.println(String.format("长方形的周长为:%.2f", rectangle.getPerimeter()));
    }
}
