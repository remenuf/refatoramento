package com.company.ModificarFuncionario;
import com.company.Funcionario.Funcionario;
import com.company.Menu;

public class RegistroSindical implements Menu {
    ModFuncionario mod;
    Funcionario funcionario;

    public RegistroSindical(Funcionario funcionario, ModFuncionario mod){
        this.funcionario = funcionario;
        this.mod = mod;
    }

    public void execute(){
        this.mod.registroSindical(funcionario);
    }
}
