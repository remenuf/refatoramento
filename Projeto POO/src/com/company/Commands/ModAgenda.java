package com.company.Commands;
import com.company.Menu;

public class ModAgenda implements Menu {
    Commands command;

    public ModAgenda(Commands command){
        this.command = command;
    }

    public void execute() {
        this.command.modAgenda();
    }
}
