package com.company.Commands;
import com.company.Menu;

public class Listar implements Menu {
    Commands command;

    public Listar(Commands command){
        this.command = command;
    }

    public void execute() {
        this.command.listar(command.funcionarios);
    }
}
