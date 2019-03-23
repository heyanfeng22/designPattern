package com.template.combinationTemplate;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/21 20:51
 * @Modified By:
 */
public class MytemplateByZuHe
{
    private void beginConnection(){
        System.out.println("开始连接！");
    }
    private void closeConnection(){
        System.out.println("关闭连接!");
    }

    /**
     * 调用方法,传入一个钩子函数的的接口
     */
    public void execute(MyCallBack myCallBack){
        this.beginConnection();
        myCallBack.doInTempletate();
        this.closeConnection();
    }

    /**
     * 所有要实现的方法都在模版中建立
     */
    public void add(final int id) {
        this.execute(new MyCallBack() {

            @Override
            public void doInTempletate() {
                System.out.println("添加了某某！+"+id);
            }
        });
    }

    public void delete(final int id)
    {
        this.execute(new MyCallBack()
        {

            @Override
            public void doInTempletate()
            {
                System.out.println("删除了+" + id);

            }
        });
    }

}
