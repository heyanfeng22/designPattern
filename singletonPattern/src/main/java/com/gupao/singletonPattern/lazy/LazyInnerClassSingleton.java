package com.gupao.singletonPattern.lazy;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/12 20:38
 * @Modified By:
 */
public class LazyInnerClassSingleton
{
    private static class InnerSingleton
    {
        private static final LazyInnerClassSingleton lazyInnerClassSingleton = new LazyInnerClassSingleton();
    }

    public static LazyInnerClassSingleton getInstance()
    {
        return InnerSingleton.lazyInnerClassSingleton;
    }
}
