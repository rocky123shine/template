package com.study.rocky.templatedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.study.rocky.templatedemo.Commend.step1.TetrisMachine;
import com.study.rocky.templatedemo.Commend.step2.Button;
import com.study.rocky.templatedemo.Commend.step2.FastCommand;
import com.study.rocky.templatedemo.Commend.step2.ICommand;
import com.study.rocky.templatedemo.Commend.step2.LeftCommand;
import com.study.rocky.templatedemo.Commend.step2.RightCommand;
import com.study.rocky.templatedemo.Commend.step2.TransformCommand;
import com.study.rocky.templatedemo.Commend.step4.Button3;
import com.study.rocky.templatedemo.template.CommComputer;
import com.study.rocky.templatedemo.template.ComputerTemplate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //首先是模板模式
        //编写代码是按照角色的划分着手
        //1 抽象模板
        //2 具体模板
        //测试模板
        ComputerTemplate template = new CommComputer();
        template.startup();
        //其次是命模式
        // 命里模式我们分四步完成 一步步优化
//        step1 不使用设计模式
        //命令模式 我们模拟俄罗斯方块游戏
        //测试
//        TetrisMachine tetrisMachine = new TetrisMachine();
//        tetrisMachine.toLeft();
//        tetrisMachine.toRight();
//        tetrisMachine.toRight();
//        tetrisMachine.transform();
//        tetrisMachine.fastToButtom();
//        step2 使用 命令模式
        //角色 接收者 命令接口 抽象命令 具体命令 请求者，
//        测试

//        TetrisMachine tetrisMachine = new TetrisMachine();
//        ICommand leftCommand = new LeftCommand(tetrisMachine);
//        ICommand rightCommand = new RightCommand(tetrisMachine);
//        ICommand transformCommand = new TransformCommand(tetrisMachine);
//        ICommand fastCommand = new FastCommand(tetrisMachine);
//
//        Button button = new Button();
//        button.setLeftCommand(leftCommand);
//        button.setRightCommand(rightCommand);
//        button.setFastCommand(fastCommand);
//        button.setTransformCommand(transformCommand);
//
//        button.toLeft();
//        button.toRight();
//        button.toRight();
//        button.transform();
//        button.fastToBottom();

//        step3 加入 撤销功能

        //step4 动态命令
//        测试
        Button3 button3 = new Button3();
        button3.toLeft();
        button3.toRight();
        button3.transform();
        button3.transform();
        button3.fastToButtom();

        button3.undoCommand();
        button3.undoCommand();
//        step4  接受任何接收者

    }
}
