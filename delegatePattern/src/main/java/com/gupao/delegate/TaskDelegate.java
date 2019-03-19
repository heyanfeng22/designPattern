package com.gupao.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/19 23:54
 * @Modified By:
 */
public class TaskDelegate implements Task
{
    private Map<String, Task> targets = new HashMap<String, Task>();

    /**
     * 项目经理持有小组成员可供选择，类似策略模式
     */
    public TaskDelegate() {
        targets.put("加密", new ConcreteTaskA());
        targets.put("登录", new ConcreteTaskB());
    }

    public void doTask(String command) {
        targets.get(command).doTask(command);
    }
}
