package com.gupao.singletonPattern.lazy;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/12 20:33
 * @Modified By:
 */
public class LazySynchronizedCodeSingleton
{
    private LazySynchronizedCodeSingleton(){}

    private static LazySynchronizedCodeSingleton lazySynchronizedCodeSingleton;

    public static LazySynchronizedCodeSingleton getInstance()
    {
        if(null==lazySynchronizedCodeSingleton)
        {
            synchronized (LazySynchronizedMethodSingleton.class)
            {
                lazySynchronizedCodeSingleton = new LazySynchronizedCodeSingleton();
            }
        }
        return lazySynchronizedCodeSingleton;
    }
}
