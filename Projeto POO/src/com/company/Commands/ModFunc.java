package com.company.Commands;
import com.company.Menu;

public class ModFunc implements Menu {
    Commands command;

    public ModFunc(Commands command){
        this.command = command;
    }

    public void execute() {
        this.command.modFunc(command.funcionarios);
    }
}
