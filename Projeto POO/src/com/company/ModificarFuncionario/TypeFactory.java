package com.company.ModificarFuncionario;
import com.company.Extractor;
import com.company.Funcionario.Assalariado;
import com.company.Funcionario.Comissionado;
import com.company.Funcionario.Funcionario;
import com.company.Funcionario.Horista;

public class TypeFactory {
    public static Funcionario alterarTipo(Funcionario funcionario){
        Extractor scan = new Extractor();

        System.out.println("Insira o novo tipo de pagamento, 1 para horário, 2 para assalariado e 3 para comissionado");
        int type = scan.getInteger();
        if (type == 1) {
            System.out.println("Digite o pagamento por hora");
            double payForH = scan.getDouble();
            return new Horista(funcionario.getName(), funcionario.getAddress(), funcionario.getpayDay(), funcionario.getTotalSalary(), 1, funcionario.getId(), funcionario.getTaxId(), funcionario.getSindicalTax(), payForH);
        }
        else if (type == 2) {
            System.out.println("Digite o salário do funcionário");
            double salary = scan.getDouble();
            return new Assalariado(funcionario.getName(), funcionario.getAddress(), funcionario.getpayDay(), funcionario.getTotalSalary(), 2, funcionario.getId(), funcionario.getTaxId(), funcionario.getSindicalTax(), salary);
        }
        else if (type == 3) {
            System.out.println("Digite o salário do funcionário");
            double salary = scan.getDouble();
            System.out.println("Informe a comissão por venda (em porcentagem)");
            double comission = scan.getDouble();
            return new Comissionado(funcionario.getName(), funcionario.getAddress(), funcionario.getpayDay(), funcionario.getTotalSalary(), 3, funcionario.getId(), funcionario.getTaxId(), funcionario.getSindicalTax(), salary, comission);
        }

        return null;
    }
}
