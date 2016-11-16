package org.gyt.aaric;

import org.gyt.task.validator.TaskValidatorFactory;

public class AaricValidation {
    public static void main(String[] args) {
        TaskValidatorFactory.newTask1Validator(new Rectangle()).validate();
        TaskValidatorFactory.newTask2Validator(new Car()).validate();
    }
}
