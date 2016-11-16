package org.gyt.task.validator;

import org.gyt.task.Task5;

import static org.junit.Assert.assertEquals;

public class Task5Validator extends BasicTaskValidator {

    private Task5 task;

    public Task5Validator(Task5 task) {
        this.task = task;
    }

    protected void doValidate() {
        assertEquals("1260,1395,1435,1530,1827,2187", task.getResult(-1000, 2000));
        assertEquals("1260,1395,1435,1530,1827,2187", task.getResult(100, 2000));
        assertEquals("1260,1395,1435,1530,1827,2187", task.getResult(1000, 2000));
        assertEquals("1260,1395,1435,1530,1827,2187", task.getResult(1000, 3000));
        assertEquals("1260,1395,1435,1530,1827,2187,6880", task.getResult(1000, 9999));
        assertEquals("1260,1395,1435,1530,1827,2187,6880", task.getResult(1000, 10000));
        assertEquals("6880", task.getResult(5000, 9999));
    }

    protected String getValidatorInfo() {
        return String.format("作业五[%s]", task.getClass().getName());
    }
}
