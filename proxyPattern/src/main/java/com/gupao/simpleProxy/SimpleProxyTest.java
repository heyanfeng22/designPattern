package com.gupao.simpleProxy;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/16 15:27
 * @Modified By:
 */
public class SimpleProxyTest
{
    public static void main(String[] args)
    {
        Girl gril = new Girl();
        ProxyShopping proxyShopping = new ProxyShopping(gril);
        proxyShopping.shopping();
    }
}
