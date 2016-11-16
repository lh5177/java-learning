package org.gyt.task.validator;

import org.gyt.task.*;

public class TaskValidatorFactory {

    private TaskValidatorFactory() {
    }

    public static TaskValidator newTask1Validator(Task1 task) {
        return new Task1Validator(task);
    }

    public static TaskValidator newTask2Validator(Task2 task) {
        return new Task2Validator(task);
    }

    public static TaskValidator newTask3Validator(Task3 task) {
        return new Task3Validator(task);
    }

    public static TaskValidator newTask4Validator(Task4 task) {
        return new Task4Validator(task);
    }

    public static TaskValidator newTask5Validator(Task5 task) {
        return new Task5Validator(task);
    }
}
