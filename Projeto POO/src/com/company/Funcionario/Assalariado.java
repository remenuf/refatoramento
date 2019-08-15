package com.company.Funcionario;

public class Assalariado extends Funcionario {

    private double salary;

    public Assalariado(String name, String address, String payday, double totalSalary, int payType, int id, int taxId, double sindicalTax, double salary) {
        super(name, address, payday, totalSalary, payType, id, taxId, sindicalTax);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void baterPonto() {
        System.out.println("Funcionário não Horista selecionado, operação não utilizável");
        return;
    }

    public void venda() {
        System.out.println("Funcionário não Comissionado selecionado, operação não utilizável");
        return;
    }

    public Funcionario calcularSalario() {
        setTotalSalary(getTotalSalary() + getSalary());
        return this;
    }
}
