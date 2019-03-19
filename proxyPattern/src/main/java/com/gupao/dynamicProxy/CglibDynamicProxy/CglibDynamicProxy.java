package com.gupao.dynamicProxy.CglibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/16 22:46
 * @Modified By:
 */
public class CglibDynamicProxy implements MethodInterceptor
{
    private Object object;
    public Object getInstance(Object obj)
    {
        this.object = obj;

        //返回代理类的实例
        Enhancer ec = new Enhancer();
        ec.setSuperclass(this.object.getClass());
        ec.setCallback(this);

       Object proxy  = ec.create();

       return proxy;

    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable
    {
        System.out.println("Cglib动态代理，监听开始！");
        Object invoke = methodProxy.invoke(this.object,objects);
        System.out.println("Cglib动态代理，结束开始！");
        return invoke;
    }
}
