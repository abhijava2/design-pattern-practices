package com.being.developer.behavioral.command;

public class CommandPatternExample {
    public static void main(String args[]) {
        System.out.println("Command Pattern Example!");
        Light light = new Light();
        LightOnCommand onCommand = new LightOnCommand(light);
        LightOffCommand offCommand = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addCommand(onCommand);
        remoteControl.addCommand(offCommand);
        // try to run all commands on light object!
        remoteControl.executeAll();

    }
}
