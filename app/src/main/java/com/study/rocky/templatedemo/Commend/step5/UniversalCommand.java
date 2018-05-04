package com.study.rocky.templatedemo.Commend.step5;

import com.study.rocky.templatedemo.Commend.step2.ICommand;

public class UniversalCommand<T> implements ICommand {

    private T reciever;
    private UniversalCommand.Callback<T> callback;

    public UniversalCommand(T reciever, UniversalCommand.Callback<T> callback){
        this.reciever = reciever;
        this.callback = callback;
    }

    @Override
    public void execute() {
        callback.call(reciever);
    }

    public static <T> UniversalCommand createCommand(T reciever, UniversalCommand.Callback<T> callback){
        return new UniversalCommand(reciever, callback);
    }

    public interface Callback<T> {
        void call(T reciever);
    }

}