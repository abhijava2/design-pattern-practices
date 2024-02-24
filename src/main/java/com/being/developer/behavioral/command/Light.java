package com.being.developer.behavioral.command;

public class Light {

    private boolean on = false;

    public void swtichOn() {
        System.out.println("Light is switching on!");
        this.on = true;
    }

    public void swtichOff() {
        System.out.println("Light is switching off!");
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

}
