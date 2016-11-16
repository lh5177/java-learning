package org.gyt.task.validator;

/**
 * Created by y27chen on 2016/11/16.
 */
public abstract class BasicTaskValidator implements TaskValidator {

    public void validate() {
        try {
            doValidate();
            TaskValidatorUtils.getLogger().info(String.format("验证成功 -- %s", getValidatorInfo()));
        } catch (AssertionError e) {
            TaskValidatorUtils.getLogger().error(String.format("验证失败 -- %s 原因: %s", getValidatorInfo(), e.getMessage()));
            e.printStackTrace();
        }
    }

    protected abstract void doValidate();

    protected abstract String getValidatorInfo();
}
