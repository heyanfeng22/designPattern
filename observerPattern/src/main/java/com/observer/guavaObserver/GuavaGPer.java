package com.observer.guavaObserver;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.observer.jdkObserver.Question;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 14:07
 * @Modified By:
 */
public class GuavaGPer
{
    private String name = "咕泡社区";

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    @Subscribe
    public void  publisQuestion(Question question)
    {
        System.out.println(question.getUsername()+"在社区发布了问题,内容是："+question.getContext());
    }

}
