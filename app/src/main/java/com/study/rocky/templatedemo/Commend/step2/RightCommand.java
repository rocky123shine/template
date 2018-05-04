package com.study.rocky.templatedemo.Commend.step2;

import com.study.rocky.templatedemo.Commend.step1.TetrisMachine;

public class RightCommand extends AbsCommend {

    public RightCommand(TetrisMachine machine){
        super(machine);
    }

    @Override
    public void execute() {
        getMachine().toRight();
    }
    
}