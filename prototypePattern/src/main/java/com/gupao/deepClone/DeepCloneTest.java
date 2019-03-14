package com.gupao.deepClone;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/14 21:12
 * @Modified By:
 */
public class DeepCloneTest
{
    public static void main(String[] args) throws Exception
    {
        String[] arr = {"1","2","3"};
        Message message = new Message();
        message.setAge("123");
        message.setMoney("222");
        Book book = new Book("娱乐至死", "尼尔波兹曼",message,arr);
        Book book1 = (Book)book.clone();
        book1.getMessage().setAge("qwe");

        String[] arr2 = {"11","22","33"};
        book1.setArr(arr2);

        //String[] 是深克隆  message是浅克隆
        //message 改一下两个都变了，arr原来的book不受影响
        System.out.println(book.toString());
        System.out.println(book1.toString());
    }
}
