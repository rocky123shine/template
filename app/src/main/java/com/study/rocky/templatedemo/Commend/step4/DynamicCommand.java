package com.study.rocky.templatedemo.Commend.step4;

import com.study.rocky.templatedemo.Commend.step1.TetrisMachine;
import com.study.rocky.templatedemo.Commend.step2.ICommand;

//动态命令
public class DynamicCommand implements ICommand {

    private TetrisMachine reciever;
    private Callback callback;

    public DynamicCommand(TetrisMachine reciever, Callback callback){
        this.reciever = reciever;
        this.callback = callback;
    }

    @Override
    public void execute() {
        callback.call(reciever);
    }

    public static DynamicCommand createCommand(TetrisMachine reciever, Callback callback){
        return new DynamicCommand(reciever, callback);
    }

    public interface Callback {
        void call(TetrisMachine reciever);
    }

}
