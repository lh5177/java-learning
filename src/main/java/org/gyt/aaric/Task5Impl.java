package org.gyt.aaric;

import org.gyt.task.Task5;

public class Task5Impl implements Task5 {
    public String getResult(int from, int to) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = from; i <= to; i++) {
            if (isPrimeNumber(i)) {
                stringBuilder.append(i).append(',');
            }
        }

        if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }

        return stringBuilder.toString();
    }

    private boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
