package com.recorator;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 11:42
 * @Modified By:
 */
public abstract class Pancake {

    public String desc = "我不是一个具体的煎饼";

    public String getDesc() {
        return desc;
    }

    public abstract double price();

}
