package com.adapter;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 11:16
 * @Modified By:
 */
//翻译者
public class Translator extends Player {

    private ForeignCenter wjzf = new ForeignCenter();

    public Translator(String name) {
        super(name);
        wjzf.setName(name);
    }

    @Override
    public void Attack()
    {
        wjzf.进攻();
    }

    @Override
    public void Defense()
    {
        wjzf.防守();
    }

}

