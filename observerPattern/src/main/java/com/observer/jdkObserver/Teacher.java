package com.observer.jdkObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 13:46
 * @Modified By:
 */
public class Teacher implements Observer
{
    private String name;

    public Teacher(String name)
    {
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

    public void update(Observable o, Object arg)
    {
        GPer gPer = (GPer) o;
        Question question = (Question)arg;

        System.out.println(this.name +"你好，你收到问题\n 来自"+gPer.getName()+",提问者是："+question.getUsername()+"，提问内容是："+question.getContext());
    }
}
