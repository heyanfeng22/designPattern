package com.observer.jdkObserver;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/23 13:51
 * @Modified By:
 */
public class ObserverTest
{
    public static void main(String[] args)
    {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");

        Question question = new Question();
        question.setUsername("小明");
        question.setContext("母猪的产后护理");

        gper.addObserver(tom);
        gper.addObserver(mic);
        gper.publisQuestion(question);
    }
}
