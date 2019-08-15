package com.company;
import com.company.Funcionario.*;
import com.company.ModificarFuncionario.*;
import java.util.ArrayList;


public class Adm{

    private int numeroDeCadastros = 0;
    private int lastId = 0;
    private Extractor scan = new Extractor();

    public void criarFuncionario (ArrayList<Funcionario> funcionarios) {
        funcionarios.add(FuncionarioFactory.criarFuncionario(lastId));
        numeroDeCadastros += 1;
        lastId += 1;
        return;
    }

    public void removerFuncionario (ArrayList<Funcionario> funcionarios){
        int id = scan.getFuncId(numeroDeCadastros, funcionarios);
        funcionarios.remove(id);
        System.out.println(">>>FUNCIONÁRIO REMOVIDO<<<\n");
        numeroDeCadastros -= 1;
        return;
    }

    public void cartaoPonto (ArrayList<Funcionario> funcionarios){
        System.out.println(">>>REGISTRO DE PONTO<<<");
        int id = scan.getFuncId(numeroDeCadastros, funcionarios);
        funcionarios.get(id).baterPonto();
        return;
    }

    public void resultVenda (ArrayList<Funcionario> funcionarios) {
        System.out.println(">>>REGISTRO DE VENDA<<<");
        int id = scan.getFuncId(numeroDeCadastros, funcionarios);
        funcionarios.get(id).venda();
        return;
    }

    public void taxaServico (ArrayList<Funcionario> funcionarios) {
        System.out.println(">>>LANÇAR TAXA DE SERVIÇO<<<");
        int id = scan.getSindId(numeroDeCadastros, funcionarios);
        System.out.println("Insira o valor a ser descontado");
        double taxa = scan.getDouble();
        funcionarios.get(id).setTotalSalary(funcionarios.get(id).getTotalSalary() - taxa);
        System.out.println(">>>ATUALIZAÇÃO CONCLUÍDA<<<\n");
        return;
    }

    public void modFuncionario (ArrayList<Funcionario> funcionarios) {
        System.out.println(">>>MODIFICAR FUNCIONÁRIO<<<");
        int id = scan.getFuncId(numeroDeCadastros, funcionarios);
        int i = 0;
        while (true){
            UseMenu menu = new UseMenu();
            ModFuncionario mod = new ModFuncionario();
            ArrayList<Menu> option = new ArrayList<Menu>();
            option.add(new Nome(funcionarios.get(id), mod));
            option.add(new Endereco(funcionarios.get(id), mod));
            option.add(new TipoPagamento(funcionarios, mod, id));
            option.add(new MetodoPagamento(funcionarios.get(id), mod));
            option.add(new RegistroSindical(funcionarios.get(id), mod));
            System.out.println("Insira o número da operação desejada\n" +
                    "[0] Alterar nome\n" +
                    "[1] Alterar endereço\n" +
                    "[2] Alterar tipo de pagamento\n" +
                    "[3] Alterar método de pagamento\n" +
                    "[4] Modificar registro sindical\n" +
                    "[5] Encerrar alterações");
            i = scan.getInteger();
            if(i < 0 || i > 4) break;
            menu.setCommand(option.get(i));
            menu.executeComand();
            }
        System.out.println(">>>MODIFICAÇÃO CONCLUÍDA<<<");
        return;
        }

}
