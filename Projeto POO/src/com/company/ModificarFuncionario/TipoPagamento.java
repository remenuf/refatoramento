package com.company.ModificarFuncionario;
import com.company.Funcionario.Funcionario;
import com.company.Menu;

import java.util.ArrayList;

public class TipoPagamento implements Menu {
    ModFuncionario mod;
    ArrayList<Funcionario> funcionario;
    int id;

    public TipoPagamento(ArrayList<Funcionario> funcionario, ModFuncionario mod, int id){
        this.funcionario = funcionario;
        this.mod = mod;
        this.id = id;
    }

    public void execute(){

        funcionario.set(id, this.mod.tipoPagamento(funcionario.get(id)));
    }
}
