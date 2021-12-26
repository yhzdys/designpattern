package com.yhzdys.learning.designpattern.n_command;

import com.yhzdys.learning.designpattern.n_command.command.CommandSleep;
import com.yhzdys.learning.designpattern.n_command.command.CommandSpeak;
import com.yhzdys.learning.designpattern.n_command.robot.RobotA;
import com.yhzdys.learning.designpattern.n_command.robot.RobotB;

/**
 * 命令模式
 * 将一个请求封装成一个对象，从而让用户使用不同的请求把客户端参数化；对请求排队或记录日志，以及支持可撤销的操作。
 */
public class CommandPattern {

    public static void main(String[] args) {
        RobotA robotA = new RobotA();
        RobotB robotB = new RobotB();
        CommandSpeak commandSpeak = new CommandSpeak(robotA);
        CommandSleep commandSleep = new CommandSleep(robotB);

        RobotInvoker robotInvoker = new RobotInvoker();

        robotInvoker.clear();
        robotInvoker.addCommand(commandSleep);
        robotInvoker.addCommand(commandSleep);
        robotInvoker.addCommand(commandSpeak);
        robotInvoker.executeAllCommand();

        System.out.println("==============================");
        robotInvoker.clear();
        robotInvoker.addCommand(commandSpeak);
        robotInvoker.addCommand(commandSpeak);
        robotInvoker.addCommand(commandSleep);
        robotInvoker.executeAllCommand();
    }

}
