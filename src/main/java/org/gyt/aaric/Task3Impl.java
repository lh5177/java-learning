package org.gyt.aaric;

import org.gyt.task.Task3;

public class Task3Impl implements Task3 {
    public String getValues(int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            stringBuilder.append(i);
            if (i != count) {
                stringBuilder.append(',');
            }
        }
        return stringBuilder.toString();
    }
}
