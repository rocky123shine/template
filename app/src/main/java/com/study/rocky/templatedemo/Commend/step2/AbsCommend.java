package com.study.rocky.templatedemo.Commend.step2;

import com.study.rocky.templatedemo.Commend.step1.TetrisMachine;

//抽象命令  实现命令接口 并且持有接收者对象

public abstract class AbsCommend implements ICommand {
    TetrisMachine machine ;
    public AbsCommend(TetrisMachine machine){
        this.machine = machine;
    }

    public TetrisMachine getMachine() {
        return machine;
    }
}
