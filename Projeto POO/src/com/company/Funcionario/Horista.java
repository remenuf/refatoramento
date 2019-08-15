package com.company.Funcionario;
import com.company.Extractor;

public class Horista extends Funcionario {

    private Extractor scan = new Extractor();
    private double hours;
    private double payForH;

    public Horista(String name, String address, String payday, double totalSalary, int payType, int id, int taxId, double sindicalTax, double payForH){
        super(name, address, payday, totalSalary, payType, id, taxId, sindicalTax);
        this.payForH = payForH;
        this.hours = 0;
    }

    public void baterPonto() {

        if (hours == 0) hours = scan.getHours();
        else {
            double x = scan.getHours() - hours;
            hours = 0;
            if (x > 8) setTotalSalary(getTotalSalary() + (payForH * 8) + (payForH * 1.5 * (x - 8)));
            else setTotalSalary(getTotalSalary() + (payForH * x));
        }
        System.out.println(">>>PONTO REGISTRADO<<<\n");
        return;
    }
    public void venda() {
        System.out.println("Funcionário não Comissionado selecionado, operação não utilizável");
        return;
    }
    public Funcionario calcularSalario(){
        return this;
    }
}
