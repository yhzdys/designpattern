package com.yhzdys.learning.designpattern.n_command.command;

import com.yhzdys.learning.designpattern.n_command.robot.RobotA;

public class CommandSpeak implements Command {
    private RobotA robot;

    public CommandSpeak(RobotA robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        this.robot.sayHello();
    }
}
