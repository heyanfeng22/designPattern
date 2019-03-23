package com.recorator;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 11:44
 * @Modified By:
 */
public class FiredEgg extends Condiment {
    private Pancake pancake;

    public FiredEgg(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc() + ", 煎蛋";
    }

    @Override
    public double price() {
        return pancake.price() + 2;
    }

}
