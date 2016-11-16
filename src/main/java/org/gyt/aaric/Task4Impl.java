package org.gyt.aaric;

import org.gyt.task.Task4;

public class Task4Impl implements Task4 {
    public String getFib(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            stringBuilder.append(getFibNumber(i));
            if (i != number) {
                stringBuilder.append(',');
            }
        }

        return stringBuilder.toString();
    }

    private int getFibNumber(int number) {
        if (number < 1) {
            return 0;
        }

        if (number == 1 || number == 2) {
            return 1;
        }

        return getFibNumber(number - 1) + getFibNumber(number - 2);
    }
}
