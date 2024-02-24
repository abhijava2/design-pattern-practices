package com.being.developer.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private final List<Command> commands;

    public RemoteControl() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void clearAll() {
        this.commands.clear();
    }
    // can give control to client which commands wants to execute!
    public void executeAll() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
