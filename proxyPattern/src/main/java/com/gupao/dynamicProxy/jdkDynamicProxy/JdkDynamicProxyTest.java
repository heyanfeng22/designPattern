package com.gupao.dynamicProxy.jdkDynamicProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/16 22:23
 * @Modified By:
 */
public class JdkDynamicProxyTest
{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {

        //思路和静态代理类一样，通过反射生成代理类的实例
        //代理类实例获取方法对象
        //调用方法
        Object proxy = new JdkDynamicProxy().getInstance(new Gril());
        Method method = proxy.getClass().getMethod("shopping",null);
        method.invoke(proxy);
    }
}
