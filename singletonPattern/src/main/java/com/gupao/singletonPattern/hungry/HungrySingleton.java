package com.gupao.singletonPattern.hungry;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/12 20:19
 * @Modified By:
 */
public class HungrySingleton
{
    private HungrySingleton(){};

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    public  static HungrySingleton getInstance()
    {
        return hungrySingleton;
    }
}
