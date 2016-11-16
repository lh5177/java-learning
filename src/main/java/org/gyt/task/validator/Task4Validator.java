package org.gyt.task.validator;

import org.gyt.task.Task4;

import static org.junit.Assert.assertEquals;

public class Task4Validator extends BasicTaskValidator {

    private Task4 task;

    public Task4Validator(Task4 task) {
        this.task = task;
    }

    protected void doValidate() {
        assertEquals("", task.getFib(-100));
        assertEquals("", task.getFib(0));
        assertEquals("1", task.getFib(1));
        assertEquals("1,1", task.getFib(2));
        assertEquals("1,1,2", task.getFib(3));
        assertEquals("1,1,2,3,5", task.getFib(5));
        assertEquals("1,1,2,3,5,8,13,21", task.getFib(8));
        assertEquals("1,1,2,3,5,8,13,21,34,55", task.getFib(10));
        assertEquals("1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765", task.getFib(20));
    }

    protected String getValidatorInfo() {
        return String.format("作业四[%s]", task.getClass().getName());
    }
}
