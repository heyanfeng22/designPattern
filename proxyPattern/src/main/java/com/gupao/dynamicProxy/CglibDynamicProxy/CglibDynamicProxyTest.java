package com.gupao.dynamicProxy.CglibDynamicProxy;

import com.gupao.dynamicProxy.jdkDynamicProxy.Gril;
import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/16 22:57
 * @Modified By:
 */
public class CglibDynamicProxyTest
{
    public static void main(String[] args)
    {

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
                "E://cglib_proxy_class/");
        //获取被代理类的实例
        Gril gril = (Gril) new CglibDynamicProxy().getInstance(new Gril());
        //System.out.println(gril);
        gril.shopping();

    }
}
