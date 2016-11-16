package org.gyt.aaric;

/**
 * 第二次作业
 * - 启动，停止，加速，减速
 * Created by y27chen on 2016/11/16.
 */
public class Car {

    private double speed;

    public Car() {
    }

    public void start() {
        speed = 100;
        printSpeed();
    }

    public void stop() {
        speed = 0;
        printSpeed();
    }

    public void speedUp() {
        speed += 10;
        printSpeed();
    }

    public void speedDown() {
        speed -= 10;
        printSpeed();
    }

    public void printSpeed() {
        System.out.println(String.format("汽车当前速度为:%.2f", speed));
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.speedUp();
        car.speedUp();
        car.speedDown();
        car.stop();
        car.speedUp();
        car.speedUp();
        car.speedUp();
        car.speedUp();
        car.speedUp();
        car.speedUp();
        car.stop();
    }
}
