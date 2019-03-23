package com.observer.guavaObserver.simpleGuavaObserver;

import com.google.common.eventbus.EventBus;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 14:14
 * @Modified By:
 */
public class GuavaEventTest
{
    public static void main(String[] args)
    {
        EventBus bus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        bus.register(guavaEvent);
        bus.post("tom");
    }
}
