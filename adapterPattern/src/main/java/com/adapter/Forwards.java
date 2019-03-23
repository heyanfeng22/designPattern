package com.adapter;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 11:14
 * @Modified By:
 */
public class Forwards  extends Player
{
    public Forwards(String name) {
        super(name);

    }

    @Override
    public void Attack() {
        System.out.println("前锋 "+name+" 进攻");

    }

    @Override
    public void Defense() {
        System.out.println("前锋 "+name+" 防守");

    }

}
