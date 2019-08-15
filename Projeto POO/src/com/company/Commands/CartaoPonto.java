package com.company.Commands;
import com.company.Menu;

public class CartaoPonto implements Menu {
    Commands command;

    public CartaoPonto(Commands command){
        this.command = command;
    }

    public void execute() {
        this.command.cartaoDePonto(command.funcionarios);
    }
}
