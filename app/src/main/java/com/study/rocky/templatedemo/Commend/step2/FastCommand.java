package com.study.rocky.templatedemo.Commend.step2;

import com.study.rocky.templatedemo.Commend.step1.TetrisMachine;

public class FastCommand extends AbsCommend {

    public FastCommand(TetrisMachine machine){
        super(machine);
    }

    @Override
    public void execute() {
        getMachine().fastToButtom();
    }
    
}
