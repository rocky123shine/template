package com.study.rocky.templatedemo.Commend.step2;

//请求者
public class Button {
    private ICommand leftCommand;
    private ICommand rightCommand;
    private ICommand fastCommand;
    private ICommand transformCommand;

    public void setLeftCommand(ICommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(ICommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFastCommand(ICommand fastCommand) {
        this.fastCommand = fastCommand;
    }

    public void setTransformCommand(ICommand transformCommand) {
        this.transformCommand = transformCommand;
    }

    //向左
    public void toLeft(){
        this.leftCommand.execute();
    }

    //向右
    public void toRight(){
        this.rightCommand.execute();
    }

    //变形
    public void transform(){
        this.transformCommand.execute();
    }

    //快下
    public void fastToBottom(){
        this.fastCommand.execute();
    }
}
