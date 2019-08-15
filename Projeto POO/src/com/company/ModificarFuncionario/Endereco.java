package com.company.ModificarFuncionario;
import com.company.Funcionario.Funcionario;
import com.company.Menu;

public class Endereco implements Menu {
    ModFuncionario mod;
    Funcionario funcionario;

    public Endereco(Funcionario funcionario, ModFuncionario mod){
        this.funcionario = funcionario;
        this.mod = mod;
    }

    public void execute(){
        this.mod.endereco(funcionario);
    }
}
