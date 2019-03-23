package com.observer.guavaObserver;

import com.google.common.eventbus.EventBus;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 14:09
 * @Modified By:
 */
public class GuavaObserverTest
{
    public static void main(String[] args)
    {
        //消息总线
        EventBus eventBus = new EventBus("咕泡社区");
        GuavaGPer gPer = new GuavaGPer();

        Teacher tom = new Teacher(gPer,"Tom");
        Teacher mic = new Teacher(gPer,"Mic");

        Question question = new Question();
        question.setUsername("小明");
        question.setContext("母猪的产后护理");


        eventBus.register(tom);
        eventBus.register(mic);
        eventBus.post(question);


    }

}
