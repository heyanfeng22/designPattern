package com.adapter;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 11:15
 * @Modified By:
 */
//中锋
public class Center extends Player {

    public Center(String name) {
        super(name);

    }

    @Override
    public void Attack() {
        System.out.println("中锋 "+name+" 进攻");

    }

    @Override
    public void Defense() {
        System.out.println("中锋 "+name+" 防守");

    }

}

