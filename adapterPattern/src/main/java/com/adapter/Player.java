package com.adapter;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 11:14
 * @Modified By:
 */
public abstract class Player
{
    protected String name;
    public Player(String name)
    {
        this.name = name;
    }

    public abstract void Attack();
    public abstract void Defense();
}
