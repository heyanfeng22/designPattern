package com.recorator;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 11:43
 * @Modified By:
 */
public class TornCake extends Pancake
{
    public TornCake() {
        desc = "手抓饼";
    }

    @Override
    public double price() {
        return 4;
    }
}
