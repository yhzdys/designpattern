package com.yhzdys.learning.designpattern.n_command.command;

import com.yhzdys.learning.designpattern.n_command.robot.RobotB;

public class CommandSleep implements Command {
    private RobotB robot;

    public CommandSleep(RobotB robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        this.robot.sleep();
    }
}
