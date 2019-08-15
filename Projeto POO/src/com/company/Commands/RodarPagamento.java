package com.company.Commands;
import com.company.Menu;

public class RodarPagamento implements Menu {
    Commands command;

    public RodarPagamento(Commands command){
        this.command = command;
    }

    public void execute() {
        this.command.folhaDePagamento(command.funcionarios);
    }
}
