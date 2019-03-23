package com.observer.guavaObserver;

import com.google.common.eventbus.Subscribe;
import com.observer.jdkObserver.GPer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 13:46
 * @Modified By:
 */
public class Teacher
{
    private GuavaGPer guavaGPer;
    private String name;

    public Teacher(GuavaGPer guavaGPer,String name)
    {
        this.guavaGPer = guavaGPer;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Subscribe
    public void update(Object arg)
    {
        Question question = (Question)arg;

        System.out.println(this.name +"你好，你收到问题\n 来自"+this.guavaGPer.getName()+",提问者是："+question.getUsername()+"，提问内容是："+question.getContext());
    }
}
