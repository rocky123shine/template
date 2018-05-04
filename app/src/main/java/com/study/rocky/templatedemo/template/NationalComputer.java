package com.study.rocky.templatedemo.template;

import android.util.Log;

//具体模板
public class NationalComputer extends ComputerTemplate{

    //子类的实现，可以更具具体要求 重写相应的方法
    @Override
    protected void powerUp() {
        Log.i("NationalComputer", "国防电脑电源按钮");
    }

    @Override
    protected void checkHardware() {
        Log.i("NationalComputer", "检查国防电脑硬件");
    }

    @Override
    protected void loadOS() {
        Log.i("NationalComputer", "加载国防电脑系统");
    }

    @Override
    protected void login() {
        Log.i("NationalComputer", "人脸登录+指纹登录");
    }
}
