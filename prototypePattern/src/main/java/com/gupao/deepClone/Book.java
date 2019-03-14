package com.gupao.deepClone;

import java.util.Arrays;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/14 21:01
 * @Modified By:
 */
public class Book implements Cloneable
{
    private String name;
    private String author;
    private Message message;
    private String[] arr;

    public String getName()
    {
        return name;
    }

    public String getAuthor()
    {
        return author;
    }

    public Message getMessage()
    {
        return message;
    }

    public String[] getArr()
    {
        return arr;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setMessage(Message message)
    {
        this.message = message;
    }

    public void setArr(String[] arr)
    {
        this.arr = arr;
    }

    public Book(String name, String author, Message message, String[] arr)
    {
        this.name = name;
        this.author = author;
        this.message = message;
        this.arr = arr;
    }


    @Override
    protected Book clone() throws CloneNotSupportedException
    {
        //String[] 是深克隆  message是浅克隆
        Book book =  (Book)super.clone();
        String[] a = book.arr.clone();
        //Message message = (Message)book.message.clone();
        book.setArr(a);
        //book.setMessage(message);
        return book;
    }

    @Override
    public String toString()
    {
        return "Book{" + "name='" + name + '\'' + ", author='" + author + '\'' + ", message=" + message + ", arr=" + Arrays.toString(arr) + '}';
    }
}
