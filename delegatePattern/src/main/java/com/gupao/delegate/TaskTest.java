package com.gupao.delegate;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/19 23:55
 * @Modified By:
 */
public class TaskTest
{
    public static void main(String[] args) {
        new TaskDelegate().doTask("登录");
        new TaskDelegate().doTask("加密");
    }
}
