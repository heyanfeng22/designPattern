package com.gupao.simpleProxy;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/16 15:24
 * @Modified By:
 */
public class ProxyShopping implements Shopping
{
    private Girl girl;

    public ProxyShopping(Girl girl)
    {
        this.girl = girl;
    }

    public void shopping()
    {
        System.out.println("进入代购的购买方法");
        this.girl.shopping();
    }
}
