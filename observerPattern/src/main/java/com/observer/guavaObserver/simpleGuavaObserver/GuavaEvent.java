package com.observer.guavaObserver.simpleGuavaObserver;

import com.google.common.eventbus.Subscribe;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 14:14
 * @Modified By:
 */
public class GuavaEvent
{
    @Subscribe
    public void subscribe(String str){
        System.out.println("执行subscribe方法，传入的参数是：" + str);
    }
}
