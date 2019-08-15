package com.company.ModificarFuncionario;
import com.company.Funcionario.Funcionario;
import com.company.Menu;

public class Nome implements Menu {
    ModFuncionario mod;
    Funcionario funcionario;

    public Nome(Funcionario funcionario, ModFuncionario mod){
        this.funcionario = funcionario;
        this.mod = mod;
    }

    public void execute(){
        this.mod.nome(funcionario);
    }
}
