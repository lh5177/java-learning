package org.gyt.task;

/**
 * Created by y27chen on 2016/11/16.
 */
public interface Task2 extends Task {
    void start();

    void stop();

    void speedUp();

    void speedDown();

    double getSpeed();
}
