package com.gupao.singletonPattern.register;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/12 20:45
 * @Modified By:
 */
public enum EnumSingleton
{
    INSTANCE;

    private Object data;

    public void setStudent(Object data)
    {
        this.data = data;
    }

    public Object getData()
    {
        return data;
    }

    public static EnumSingleton getInstance()
    {
        return INSTANCE;
    }

}
