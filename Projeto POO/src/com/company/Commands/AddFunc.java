package com.company.Commands;
import com.company.Menu;

public class AddFunc implements Menu {
    Commands command;

    public AddFunc(Commands command){
        this.command = command;
    }

    public void execute() {
        this.command.criar(command.funcionarios);
    }
}
