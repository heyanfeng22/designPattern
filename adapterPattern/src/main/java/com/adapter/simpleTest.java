package com.adapter;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 11:15
 * @Modified By:
 */
public class simpleTest
{
    public static void main(String[] args) {

        Player b = new Forwards("巴蒂尔");
        b.Attack();

        Player m = new Guards("麦克格雷迪");
        m.Attack();

        Player ym = new Center("外籍中锋");

        ym.Attack();
        ym.Defense();

    }
}
