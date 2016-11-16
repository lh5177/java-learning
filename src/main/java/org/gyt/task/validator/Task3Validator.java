package org.gyt.task.validator;

import org.gyt.task.Task3;

import static org.junit.Assert.assertEquals;

public class Task3Validator extends BasicTaskValidator {

    private Task3 task;

    public Task3Validator(Task3 task) {
        this.task = task;
    }

    protected void doValidate() {
        assertEquals("", task.getValues(-100));
        assertEquals("", task.getValues(0));
        assertEquals("1", task.getValues(1));
        assertEquals("1,2,3,4,5,6,7,8,9,10", task.getValues(10));
        assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50", task.getValues(50));
    }

    protected String getValidatorInfo() {
        return String.format("作业三[%s]", task.getClass().getName());
    }
}
