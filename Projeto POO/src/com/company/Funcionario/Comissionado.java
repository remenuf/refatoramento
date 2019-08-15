package com.company.Funcionario;
import com.company.Extractor;

public class Comissionado extends Assalariado {

    private Extractor scan = new Extractor();
    private double comission;

    public Comissionado(String name, String address, String payday, double totalSalary, int payType, int id, int taxId, double sindicalTax, double salary, double comission) {
        super(name, address, payday, totalSalary, payType, id, taxId, sindicalTax, salary);
        this.comission = comission;
    }

    public void venda(){
        System.out.println(">>>INSIRA O VALOR DA VENDA<<<");
        setTotalSalary(getTotalSalary() + (scan.getDouble() * (comission/100)));
        System.out.println(">>>VENDA REGISTRADA<<<\n");
    }
    public Funcionario calcularSalario() {
        setTotalSalary(getTotalSalary() + getSalary()/2);
        return this;
    }
}
