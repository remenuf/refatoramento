package com.company.Commands;

import com.company.Menu;

import java.util.ArrayList;

public class ProxDia implements Menu {
    Commands command;

    public ArrayList<String> agenda;
    public ProxDia(Commands command){
        this.command = command;
    }

    public void execute() {
        this.command.proxDia();
    }
}
