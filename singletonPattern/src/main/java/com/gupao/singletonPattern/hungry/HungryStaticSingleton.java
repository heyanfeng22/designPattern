package com.gupao.singletonPattern.hungry;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/12 20:22
 * @Modified By:
 */
public class HungryStaticSingleton
{
    private HungryStaticSingleton(){}

    private  static HungryStaticSingleton hungryStaticSingleton ;
    static
    {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    public HungryStaticSingleton getInstance()
    {
        return hungryStaticSingleton;
    }
}
