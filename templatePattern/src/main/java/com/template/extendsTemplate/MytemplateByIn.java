package com.template.extendsTemplate;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/21 20:45
 * @Modified By:
 */
public abstract class MytemplateByIn
{
    private void beginConnection(){
        System.out.println("开始连接！");
    }
    private void closeConnection(){
        System.out.println("关闭连接!");
    }

    public abstract void run();
    public abstract boolean validateRun();

    public void execute(){
        this.beginConnection();
        if (this.validateRun()) {
            this.run();
        }
        this.closeConnection();
    }
}
