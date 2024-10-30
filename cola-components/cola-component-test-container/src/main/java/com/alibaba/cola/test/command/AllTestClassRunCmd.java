package com.alibaba.cola.test.command;

import com.alibaba.cola.test.TestsContainer;

/**
 * TestClassRunCmd
 *
 * @author Frank Zhang
 * @date 2020-11-17 4:42 PM
 */
public class AllTestClassRunCmd extends AbstractCommand {
    private String packageName;

    public AllTestClassRunCmd(String cmdRaw) {
        super(cmdRaw);
        this.packageName = cmdRaw.replace(CommandEnum.AllTestClassRunCmd.getDesc(), "");
    }

    @Override
    protected void action() {
        try {
            TestsContainer.getTestExecutor().execute(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getPackageName() {
        return packageName;
    }
}
