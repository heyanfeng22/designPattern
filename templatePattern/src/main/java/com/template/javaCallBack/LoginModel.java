package com.template.javaCallBack;

/**
 * @Autor : heyanfeng22
 * @Description :
 * @Date:Create:in 2019/3/22 17:29
 * @Modified By:
 */
public class LoginModel
{
    /**
     * 登录人员的编号，通用的，可能是用户编号，也可能是工作人员编号
     */
    private String loginId;
    /**
     * 登录的密码
     */
    private String pwd;

    public String getLoginId()
    {
        return loginId;
    }

    public void setLoginId(String loginId)
    {
        this.loginId = loginId;
    }

    public String getPwd()
    {
        return pwd;
    }

    public void setPwd(String pwd)
    {
        this.pwd = pwd;
    }

    @Override
    public String toString()
    {
        return "LoginModel{" + "loginId='" + loginId + '\'' + ", pwd='" + pwd + '\'' + '}';
    }
}
