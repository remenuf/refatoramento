package com.company.Commands;
import com.company.Menu;

public class TaxaServico implements Menu {
    Commands command;

    public TaxaServico(Commands command){
        this.command = command;
    }

    public void execute() {
        this.command.taxaServico(command.funcionarios);
    }
}
