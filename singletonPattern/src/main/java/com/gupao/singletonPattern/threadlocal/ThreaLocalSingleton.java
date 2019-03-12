package com.gupao.singletonPattern.threadlocal;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/12 21:06
 * @Modified By:
 */
public class ThreaLocalSingleton
{
    private  ThreaLocalSingleton(){}

    private static final ThreadLocal<ThreaLocalSingleton> threadLocal = new ThreadLocal<ThreaLocalSingleton>()
    {
        @Override
        protected ThreaLocalSingleton initialValue()
        {
            return  new ThreaLocalSingleton();
        }
    };

    public static ThreaLocalSingleton getInstance()
    {
        return threadLocal.get();
    }
}
