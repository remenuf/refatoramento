package com.company.Commands;

import com.company.Menu;

import java.util.ArrayList;

public class NewAgenda implements Menu {
    Commands command;

    public ArrayList<String> agenda;
    public NewAgenda(Commands command){
        this.command = command;
    }

    public void execute() {
        this.command.newAgenda();
    }
}
