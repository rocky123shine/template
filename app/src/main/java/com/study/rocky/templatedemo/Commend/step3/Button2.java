package com.study.rocky.templatedemo.Commend.step3;

import android.util.Log;

import com.study.rocky.templatedemo.Commend.step2.ICommand;

import java.util.ArrayList;
import java.util.List;

public class Button2 {

    private ICommand leftCommand;
    private ICommand rightCommand;
    private ICommand fastCommand;
    private ICommand transformCommand;

    private List<ICommand> commandList = new ArrayList<ICommand>();

    public void setFastCommand(ICommand fastCommand) {
        this.fastCommand = fastCommand;
    }

    public void setLeftCommand(ICommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(ICommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setTransformCommand(ICommand transformCommand) {
        this.transformCommand = transformCommand;
    }

    //向左
    public void toLeft(){
        this.leftCommand.execute();
        commandList.add(this.leftCommand);
    }

    //向右
    public void toRight(){
        this.rightCommand.execute();
        commandList.add(this.rightCommand);
    }

    //变形
    public void transform(){
        this.transformCommand.execute();
        commandList.add(this.transformCommand);
    }

    //快下
    public void fastToButtom(){
        this.fastCommand.execute();
        commandList.add(this.fastCommand);
    }

    //撤销功能->撤销单个命令
    public void undoCommand(){
        Log.i("main", "撤销: ");
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