package com.study.rocky.templatedemo.Commend.step1;

import android.util.Log;

//不使用设计模式的案例
public class TetrisMachine {
    //向左
    public void toLeft(){
        Log.i("TetrisMachine", "向左");
    }

    //向右
    public void toRight(){
        Log.i("TetrisMachine", "向右");
    }

    //变形
    public void transform(){
        Log.i("TetrisMachine", "变形");
    }

    //快下
    public void fastToButtom(){
        Log.i("TetrisMachine", "快下");
    }
}
