package com.observer.jdkObserver;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 13:43
 * @Modified By:
 */
public class Question
{
    private String username;

    private String context;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getContext()
    {
        return context;
    }

    public void setContext(String context)
    {
        this.context = context;
    }

    @Override
    public String toString()
    {
        return "Question{" + "username='" + username + '\'' + ", context='" + context + '\'' + '}';
    }
}
