package org.gyt.task.validator;

import org.gyt.task.Task1;

import static org.junit.Assert.assertEquals;

public class Task1Validator implements TaskValidator {

    private Task1 task;

    public Task1Validator(Task1 task) {
        this.task = task;
    }

    public void validate() {
        try {
            task.setWidth(40);
            task.setHeight(30);

            assertEquals(1200f, task.getArea(), 0);
            assertEquals(140f, task.getPerimeter(), 0);
            TaskValidatorUtils.getLogger().info(String.format("作业一验证成功:[%s]", task.getClass().getName()));
        } catch (AssertionError e) {
            TaskValidatorUtils.getLogger().error(String.format("作业二验证失败:[%s] 原因：%s", task.getClass().getName(), e.getMessage()));
            e.printStackTrace();
        }
    }
}
