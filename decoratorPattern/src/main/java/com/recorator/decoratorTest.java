package com.recorator;

import org.junit.Test;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 11:45
 * @Modified By:
 */
public class decoratorTest
{
    @Test
    public void test() {
        Pancake tornCake = new TornCake();
        //手抓饼基础价
        System.out.println(String.format("%s ￥%s", tornCake.getDesc(), tornCake.price()));

        Pancake roujiamo = new Roujiamo();
        roujiamo = new FiredEgg(roujiamo);
        roujiamo = new FiredEgg(roujiamo);
        roujiamo = new Ham(roujiamo);
        //roujiamo = new MeatFloss(roujiamo);
        //roujiamo = new Cucumber(roujiamo);
        //我好饿
        System.out.println(String.format("%s ￥%s", roujiamo.getDesc(), roujiamo.price()));
    }
}
