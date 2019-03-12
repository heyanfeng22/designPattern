package com.gupao.singletonPattern.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/12 20:54
 * @Modified By:
 */
public class ContainerSingleton
{
    private ContainerSingleton (){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getBean(String className)
    {
        synchronized (ioc)
        {
            if(!ioc.containsKey(className))
            {
                Object obj = null;
                try
                {
                    obj = (Object) Class.forName(className).newInstance();
                    ioc.put(className,obj);
                } catch (Exception e)
                {
                    e.printStackTrace();
                }

                return obj;
            }
            else
            {
                return ioc.get(className);
            }
        }


    }

}
