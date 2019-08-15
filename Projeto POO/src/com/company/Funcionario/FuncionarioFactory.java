package com.company.Funcionario;
import com.company.Extractor;
import java.util.Scanner;

public class FuncionarioFactory {

    public static Funcionario criarFuncionario(int lastId){
        Scanner input = new Scanner(System.in);
        Extractor scan = new Extractor();

        String name;
        String address;

        System.out.println(">>>ADICIONAR EMPREGADO<<<\n");
        System.out.println("Digite o nome");
        name = input.nextLine();
        System.out.println("Digite o endereço");
        address = input.nextLine();
        System.out.println("Digite o tipo de funcionário, 1 para horário, 2 para assalariado e 3 para comissionado");
        int type = scan.getInteger();

        if (type == 1) {
            System.out.println("Digite o pagamento por hora");
            double payForH = scan.getDouble();
            return new Horista(name, address, "semanal 1 sexta", 0, 1, lastId, 0, 0, payForH);
        }
        else {
            System.out.println("Digite o salário do funcionário");
            double salary = scan.getDouble();
            if (type == 3) {
                System.out.println("Informe a comissão por venda (em porcentagem)");
                double comission = scan.getDouble();
                return new Comissionado(name, address, "semanal 2 sexta", 0, 3, lastId, 0, 0, salary, comission);
            }
            else {
                return new Assalariado(name, address, "mensal $", 0, 2, lastId, 0, 0, salary);
            }
        }
    }
}
