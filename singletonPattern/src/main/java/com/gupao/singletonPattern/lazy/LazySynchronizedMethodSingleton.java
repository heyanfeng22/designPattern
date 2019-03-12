package com.gupao.singletonPattern.lazy;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/12 20:31
 * @Modified By:
 */
public class LazySynchronizedMethodSingleton
{
    private static LazySynchronizedMethodSingleton lazySynchronizedMethodSingleton;

    public static synchronized LazySynchronizedMethodSingleton getInstance()
    {
        if(null==lazySynchronizedMethodSingleton)
        {
            lazySynchronizedMethodSingleton = new LazySynchronizedMethodSingleton();
        }
        return lazySynchronizedMethodSingleton;
    }
}
