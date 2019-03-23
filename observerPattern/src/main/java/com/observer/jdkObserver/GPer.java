package com.observer.jdkObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 13:38
 * @Modified By:
 */
public class GPer extends Observable
{
    private String name = "咕泡社区";
    private static GPer gPer= null;
    private  GPer(){}
    public static GPer getInstance()
    {
        if(null==gPer)
        {
            gPer = new GPer();
        }
        return gPer;
    }

    public String getName()
    {
        return name;
    }

    public void publisQuestion(Question question)
    {
        System.out.println(question.getUsername()+"在社区发布了问题,内容是："+question.getContext());
        setChanged();
        notifyObservers(question);
    }

}
