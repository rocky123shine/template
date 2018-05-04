package com.study.rocky.templatedemo.Commend.step2;

import com.study.rocky.templatedemo.Commend.step1.TetrisMachine;

//具体命令
public class LeftCommand extends AbsCommend {

    public LeftCommand(TetrisMachine machine){
        super(machine);
    }

    @Override
    public void execute() {
        getMachine().toLeft();
    }

}