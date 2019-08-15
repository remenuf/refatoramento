package com.company.Commands;
import com.company.Menu;

public class RemoveFunc implements Menu {
    Commands command;

    public RemoveFunc(Commands command){
        this.command = command;
    }

    public void execute() {
        this.command.remover(command.funcionarios);
    }
}
