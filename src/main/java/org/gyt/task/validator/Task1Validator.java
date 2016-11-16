package org.gyt.task.validator;

import org.gyt.task.Task1;

import static org.junit.Assert.assertEquals;

public class Task1Validator extends BasicTaskValidator {

    private Task1 task;

    public Task1Validator(Task1 task) {
        this.task = task;
    }

    protected void doValidate() {
        task.setWidth(40);
        task.setHeight(30);

        assertEquals(1200f, task.getArea(), 0);
        assertEquals(140f, task.getPerimeter(), 0);
    }

    protected String getValidatorInfo() {
        return String.format("作业一[%s]", task.getClass().getName());
    }
}
