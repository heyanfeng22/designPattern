package com.gupao.dynamicProxy.jdkDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/16 22:13
 * @Modified By:
 */
public class JdkDynamicProxy implements InvocationHandler
{
    //先获取代理类对象实例
    private Object object;


    //创建动态的代理工厂对象
    public Object getInstance(Object object)
    {
        this.object = object;

        //newProxyInstance三个参数：1、代理对象的classLoader加载器2、被代理对象的所有接口3、代理类自己的实例
        Object proxyObject = Proxy.newProxyInstance(this.object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);

        return proxyObject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        System.out.println("before");
        Object obj = method.invoke(this.object,args);
        System.out.println("after");

        return obj;
    }
}
