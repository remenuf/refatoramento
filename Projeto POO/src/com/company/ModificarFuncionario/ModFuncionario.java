package com.company.ModificarFuncionario;
import com.company.Extractor;
import com.company.Funcionario.*;

import java.util.Scanner;

public class ModFuncionario {

    private Scanner input = new Scanner(System.in);
    private Extractor scan = new Extractor();

    public ModFuncionario(){}

    public void nome(Funcionario funcionario){
        System.out.println("Insira o novo nome");
        funcionario.setName(input.nextLine());
        return;
    }

    public void endereco(Funcionario funcionario){
        System.out.println("Insira o novo endereço");
        funcionario.setAddress(input.nextLine());
        return;
    }

    public Funcionario tipoPagamento(Funcionario funcionario){
        return TypeFactory.alterarTipo(funcionario);
    }

    public void metodoPagamento(Funcionario funcionario){
        System.out.println("Insira o novo método de pagamento, 1 para depósito, 2 para cheque via correio e 3 para cheque em mãos");
        int x = scan.getInteger();
        if (0 > x && x < 4) funcionario.setPayType(x);
        else System.out.println("Entrada inválida.");
        return;
    }

    public void registroSindical(Funcionario funcionario){
        System.out.println("Insira a nova identificação dentro do sindicato");
        funcionario.setTaxId(scan.getInteger());
        System.out.println("insira a nova taxa sindical");
        funcionario.setSindicalTax(scan.getDouble());
        return;
    }
}
