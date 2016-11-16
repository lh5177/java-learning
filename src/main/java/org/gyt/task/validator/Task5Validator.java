package org.gyt.task.validator;

import org.gyt.task.Task5;

import static org.junit.Assert.assertEquals;

public class Task5Validator extends BasicTaskValidator {

    private Task5 task;

    public Task5Validator(Task5 task) {
        this.task = task;
    }

    protected void doValidate() {
        assertEquals("", task.getResult(-1000, -500));
        assertEquals("2,3,5,7", task.getResult(-100, 10));
        assertEquals("2,3,5,7,11,13,17,19", task.getResult(1, 20));
        assertEquals("2,3,5,7,11,13,17,19,23,29,31,37,41,43,47", task.getResult(1, 50));
        assertEquals("2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97", task.getResult(1, 100));
    }

    protected String getValidatorInfo() {
        return String.format("作业五[%s]", task.getClass().getName());
    }
}
