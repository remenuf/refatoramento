package com.company;
import com.company.Commands.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Extractor scan = new Extractor();
        ArrayList<String> agenda = new ArrayList<String>();
        agenda.add("semanal 1 sexta");
        agenda.add("semanal 2 sexta");
        agenda.add("mensal $");

        Commands commands = new Commands(agenda);
        UseMenu menu = new UseMenu();
        ArrayList<Menu> option = new ArrayList<Menu>();
        option.add(new Listar(commands));
        option.add(new AddFunc(commands));
        option.add(new RemoveFunc(commands));
        option.add(new CartaoPonto(commands));
        option.add(new Venda(commands));
        option.add(new TaxaServico(commands));
        option.add(new ModFunc(commands));
        option.add(new RodarPagamento(commands));
        option.add(new ModAgenda(commands));
        option.add(new NewAgenda(commands));
        option.add(new ProxDia(commands));
        option.add(new Fechar(commands));

        System.out.println(commands.lastDay);
        System.out.println(commands.dayC);
        while (true){
            commands.attData();
            System.out.println("SELECIONE A OPERAÇÃO DESEJADA\n\n" +
                    "[0]  Listar funcionários\n" +
                    "[1]  Adicionar funcionário\n" +
                    "[2]  Remover funcionário\n" +
                    "[3]  Lançar cartão de ponto\n" +
                    "[4]  Lançar resultado de venda\n" +
                    "[5]  Lançar taxa de serviço\n" +
                    "[6]  Modificar dados de um funcionário\n" +
                    "[7]  Rodar folha de pagamento do dia\n" +
                    "[8]  Alterar agenda de pagamento\n" +
                    "[9]  Criar nova agenda de pagamento\n" +
                    "[10] Encerrar o dia\n" +
                    "[11] Encerrar o programa");
            int x =  scan.getInteger();
            if (x < 0 || x > 11) break;
            menu.setCommand(option.get(x));
            menu.executeComand();
        }
    }
}
