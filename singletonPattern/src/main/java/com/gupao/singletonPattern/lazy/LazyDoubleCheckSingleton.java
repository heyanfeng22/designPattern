package com.gupao.singletonPattern.lazy;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/12 20:36
 * @Modified By:
 */
public class LazyDoubleCheckSingleton
{
    private static LazySynchronizedMethodSingleton lazySynchronizedMethodSingleton;

    public static LazySynchronizedMethodSingleton getInstance()
    {
        if(null==lazySynchronizedMethodSingleton)
        {
            synchronized (LazySynchronizedMethodSingleton.class)
            {
                if(null==lazySynchronizedMethodSingleton)
                {
                    lazySynchronizedMethodSingleton = new LazySynchronizedMethodSingleton();
                }
            }
        }

        return lazySynchronizedMethodSingleton;
    }

}
