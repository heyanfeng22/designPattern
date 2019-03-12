package com.gupao.singletonPattern.lazy;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/12 20:26
 * @Modified By:
 */
public class LazySingleton
{
    private LazySingleton(){}

    private static LazySingleton lazySingleton;

    public static LazySingleton getInstance()
    {
        if(null==lazySingleton)
        {
            lazySingleton = new LazySingleton();

        }
        return lazySingleton;
    }
}
