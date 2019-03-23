package com.adapter;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 11:15
 * @Modified By:
 */
//后卫
public class Guards extends Player {

    public Guards(String name) {
        super(name);

    }

    @Override
    public void Attack() {
        System.out.println("后卫 "+name+" 进攻");

    }

    @Override
    public void Defense() {
        System.out.println("后卫 "+name+" 防守");

    }

}
