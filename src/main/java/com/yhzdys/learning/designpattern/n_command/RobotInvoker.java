package com.yhzdys.learning.designpattern.n_command;

import com.yhzdys.learning.designpattern.n_command.command.Command;

import java.util.ArrayList;
import java.util.List;

public class RobotInvoker {
    private final List<Command> commands = new ArrayList<>();

    public void clear() {
        this.commands.clear();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void executeAllCommand() {
        this.commands.forEach(Command::execute);
    }

}
