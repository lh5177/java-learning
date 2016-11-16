package org.gyt.task.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskValidatorUtils {

    private static final Logger LOGGER = LogManager.getLogger(TaskValidatorUtils.class);

    private TaskValidatorUtils() {
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}
