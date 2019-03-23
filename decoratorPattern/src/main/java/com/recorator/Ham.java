package com.recorator;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 11:45
 * @Modified By:
 */
public class Ham extends Condiment {
    private Pancake pancake;

    public Ham(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc() + ", 火腿片";
    }

    @Override
    public double price() {
        return pancake.price() + 1.5;
    }

}
