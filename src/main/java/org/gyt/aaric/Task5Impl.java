package org.gyt.aaric;

import org.gyt.task.Task5;

/**
 * Created by y27chen on 2016/11/16.
 */
public class Task5Impl implements Task5 {
    public String getResult(int from, int to) {
        int start = from;
        int end = to;

        if (from < 1000) {
            start = 1000;
        }

        if (to > 9999) {
            end = 9999;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = start; i <= end; i++) {
            if (isCorrectNumber(i)) {
                stringBuilder.append(i).append(',');
            }
        }

        return stringBuilder.toString();
    }

    private boolean isCorrectNumber(int number) {
        return false;
    }
}
