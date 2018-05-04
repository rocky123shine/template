package com.study.rocky.templatedemo.Commend.step2;

import com.study.rocky.templatedemo.Commend.step1.TetrisMachine;

public class TransformCommand extends AbsCommend {

    public TransformCommand(TetrisMachine machine){
        super(machine);
    }

    @Override
    public void execute() {
        getMachine().transform();
    }
    
}