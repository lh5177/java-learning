package org.gyt.aaric;

import org.gyt.liuh.impl.Practice3Impl;
import org.gyt.task.validator.TaskValidatorFactory;

public class AaricValidation {
    public static void main(String[] args) {
       TaskValidatorFactory.newTask1Validator(new Task1Impl()).validate();
        TaskValidatorFactory.newTask2Validator(new Task2Impl()).validate();
        TaskValidatorFactory.newTask3Validator(new Practice3Impl()).validate();
        TaskValidatorFactory.newTask4Validator(new Task4Impl()).validate();
        TaskValidatorFactory.newTask5Validator(new Task5Impl()).validate();
    }
}
