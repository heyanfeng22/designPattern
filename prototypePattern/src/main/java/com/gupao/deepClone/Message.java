package com.gupao.deepClone;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/14 21:02
 * @Modified By:
 */
public class Message implements Cloneable
{
    private String age;
    private String money;

    public String getAge()
    {
        return age;
    }

    public String getMoney()
    {
        return money;
    }

    public void setAge(String age)
    {
        this.age = age;
    }

    public void setMoney(String money)
    {
        this.money = money;
    }

    @Override
    public String toString()
    {
        return "Message{" + "age='" + age + '\'' + ", money='" + money + '\'' + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
