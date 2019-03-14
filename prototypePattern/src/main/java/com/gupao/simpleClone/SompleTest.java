package com.gupao.simpleClone;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/14 20:57
 * @Modified By:
 */
public class SompleTest
{
    public static void main(String[] args)
    {

        Book booka = new Book("娱乐至死", "尼尔波兹曼", "社会科学", "XXXX");
        Book bookb = (Book)booka.clone();

        System.out.println(booka==bookb);
        System.out.println(booka.getAuthor());
        System.out.println(bookb.getAuthor());


    }
}
