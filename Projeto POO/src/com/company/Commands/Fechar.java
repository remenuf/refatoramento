package com.company.Commands;
import com.company.Menu;

public class Fechar implements Menu {
    Commands command;

    public Fechar(Commands command){
        this.command = command;
    }

    public void execute() {
        this.command.fechar();
    }
}
