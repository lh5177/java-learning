package org.gyt.task.validator;

import org.gyt.task.Task2;

import static org.junit.Assert.assertEquals;

public class Task2Validator extends BasicTaskValidator {

    private Task2 task;

    public Task2Validator(Task2 task) {
        this.task = task;
    }

    protected void doValidate() {
        assertEquals(0, task.getSpeed(), 0);
        task.start();
        assertEquals(100, task.getSpeed(), 0);
        task.speedUp();
        assertEquals(110, task.getSpeed(), 0);
        task.speedUp();
        assertEquals(120, task.getSpeed(), 0);
        task.speedDown();
        assertEquals(110, task.getSpeed(), 0);
        task.stop();
        assertEquals(0, task.getSpeed(), 0);
        task.speedUp();
        assertEquals(10, task.getSpeed(), 0);
        task.speedUp();
        assertEquals(20, task.getSpeed(), 0);
        task.speedDown();
        assertEquals(10, task.getSpeed(), 0);
        task.stop();
        assertEquals(0, task.getSpeed(), 0);
        task.speedDown();
        assertEquals(0, task.getSpeed(), 0);
    }

    protected String getValidatorInfo() {
        return String.format("作业二[%s]", task.getClass().getName());
    }
}
