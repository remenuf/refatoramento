package com.company;

public class UseMenu {
    Menu slot;

    public UseMenu(){}

    public void setCommand(Menu command) {
        this.slot = command;
    }

    public void executeComand() {
        this.slot.execute();
    }
}
