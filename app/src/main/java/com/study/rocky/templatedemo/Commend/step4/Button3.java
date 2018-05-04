package com.study.rocky.templatedemo.Commend.step4;

import android.util.Log;

import com.study.rocky.templatedemo.Commend.step1.TetrisMachine;
import com.study.rocky.templatedemo.Commend.step2.ICommand;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Button3 {

    private TetrisMachine machine = new TetrisMachine();
    private List<ICommand> commandList = new ArrayList<ICommand>();

    //向左
    public void toLeft(){
       this.machine.toLeft();
        addCommand("toLeft");
    }

    //向右
    public void toRight(){
       this.machine.toRight();
        addCommand("toRight");
    }

    //变形
    public void transform(){
        this.machine.transform();
        addCommand("transform");
    }

    //快下
    public void fastToButtom(){
        this.machine.fastToButtom();
        addCommand("fastToButtom");
    }

    //Java反射机制实现
    private void addCommand(String methodName){
        try {
            final Method method = this.machine.getClass().getMethod(methodName);
            commandList.add(DynamicCommand.createCommand(machine, new DynamicCommand.Callback() {
                @Override
                public void call(TetrisMachine reciever) {
                    try {

                        method.invoke(reciever);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    //撤销功能->撤销单个命令
    public void undoCommand(){
        Log.i("TetrisMachine", "撤销: ");
        if (commandList.size() > 0){
            commandList.remove(commandList.size() - 1).execute();
        }
    }

    //撤销所有->撤销多个命令
    public void undoCommandAll(){
        if (commandList.size() > 0){
            while (commandList.size() > 0){
                commandList.remove(commandList.size() - 1).execute();
            }
        }
    }

}