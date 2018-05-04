package com.study.rocky.templatedemo.template;

//抽象模板
public abstract class ComputerTemplate {
    //本 demo是模拟电脑实际情形  ---------从中我们也可以 发现 这些步骤都是有固定顺序的

    //提供开机的方法
    public void startup() {
        //按下电源
        powerUp();
        //检查硬件
        try {
            checkHardware();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //加载系统
        loadOS();
        //登录系统
        login();
    }


    protected abstract void powerUp();

    protected abstract void checkHardware();

    protected abstract void loadOS();

    protected abstract void login();
}
