package com.company.Commands;
import com.company.Menu;

public class Venda implements Menu {
    Commands command;

    public Venda(Commands command){
        this.command = command;
    }

    public void execute() {
        this.command.resultVenda(command.funcionarios);
    }
}
