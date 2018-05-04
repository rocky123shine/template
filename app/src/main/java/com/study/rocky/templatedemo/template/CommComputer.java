package com.study.rocky.templatedemo.template;

import android.util.Log;

//具体的模板
public class CommComputer extends ComputerTemplate {

    @Override
    protected void powerUp() {
        Log.d("CommComputer", "按下按钮");
    }

    @Override
    protected void checkHardware() {
        Log.d("CommComputer", "检查硬件");
    }

    @Override
    protected void loadOS() {
        Log.d("CommComputer", "加载系统");
    }

    @Override
    protected void login() {
        Log.d("CommComputer", "登录系统");
    }
}
