package com.company.Commands;

import com.company.Adm;
import com.company.Agenda;
import com.company.FolhaDePagamento;
import com.company.Funcionario.Funcionario;
import java.util.ArrayList;
import java.util.Calendar;


public class Commands {
    ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    Adm admin = new Adm();
    FolhaDePagamento payroll = new FolhaDePagamento();
    Agenda modAgenda = new Agenda();
    Calendar data = Calendar.getInstance();
    public ArrayList<String> agenda;
    public int lastDay, dayC;

    public Commands(ArrayList<String> agenda){
        this.agenda = agenda;
        lastDay = modAgenda.diaUtil(data);
        dayC = 0;
    }

    public void listar(ArrayList<Funcionario> funcionarios){
        for (int f = 0; f < funcionarios.size(); f++)
        {
            System.out.printf("%d ................. %s\n", f, funcionarios.get(f).getName());
        }
        return;
    }
    public void criar(ArrayList<Funcionario> funcionarios){
        admin.criarFuncionario(funcionarios);
        return;
    }
    public void remover(ArrayList<Funcionario> funcionarios){
        admin.removerFuncionario(funcionarios);
        return;
    }
    public void cartaoDePonto(ArrayList<Funcionario> funcionarios){
        admin.cartaoPonto(funcionarios);
        return;
    }
    public void resultVenda(ArrayList<Funcionario> funcionarios){
        admin.resultVenda(funcionarios);
        return;
    }
    public void taxaServico(ArrayList<Funcionario> funcionarios){
        admin.taxaServico(funcionarios);
        return;
    }
    public void modFunc(ArrayList<Funcionario> funcionarios){
        admin.modFuncionario(funcionarios);
        return;
    }
    public void folhaDePagamento(ArrayList<Funcionario> funcionarios){
        payroll.pay(funcionarios, agenda, data, lastDay, dayC);
        return;
    }
    public void newAgenda(){
        modAgenda.newAgenda(agenda);
    }
    public void modAgenda(){
        modAgenda.alterarAgenda(funcionarios,agenda);
        return;
    }
    public void proxDia(){
        data.add(Calendar.DAY_OF_MONTH, 1);
        dayC +=1;
        return;
    }

    public void attData(){
        dayC = dayC % 13;
        if (data.get(Calendar.DAY_OF_MONTH) == 1) lastDay = modAgenda.diaUtil((data));
        System.out.printf("%02d/%02d/%d\n", data.get(Calendar.DAY_OF_MONTH), data.get(Calendar.MONTH) + 1, data.get(Calendar.YEAR));
        return;
    }

    public void fechar(){
        System.exit(0);
    }
}
