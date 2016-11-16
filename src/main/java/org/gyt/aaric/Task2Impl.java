package org.gyt.aaric;

import org.gyt.task.Task2;

/**
 * 第二次作业
 * - 启动，停止，加速，减速
 * Created by y27chen on 2016/11/16.
 */
public class Task2Impl implements Task2 {

    private double speed;

    public Task2Impl() {
    }

    public void start() {
        speed = 100;
    }

    public void stop() {
        speed = 0;
    }

    public void speedUp() {
        speed += 10;
    }

    public void speedDown() {
        if (speed > 10) {
            speed -= 10;
        }
    }

    public double getSpeed() {
        return speed;
    }
}
