package com.gupao.delegate;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/19 23:52
 * @Modified By:
 */
public class ConcreteTaskA implements Task
{
    public void doTask(String command)
    {
        System.out.println("A执行任务"+command);
    }
}
