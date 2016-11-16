package org.gyt.task.validator;

import org.gyt.task.Task1;
import org.gyt.task.Task2;

public class TaskValidatorFactory {

    private TaskValidatorFactory() {
    }

    public static TaskValidator newTask1Validator(Task1 task) {
        return new Task1Validator(task);
    }

    public static TaskValidator newTask2Validator(Task2 task) {
        return new Task2Validator(task);
    }
}
