package org.gyt.aaric;

import org.gyt.task.Task1;

/**
 * 第一次作业
 * - 计算长方形的面积和周长
 * Created by y27chen on 2016/11/16.
 */
public class Task1Impl implements Task1 {

    private double width;

    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
