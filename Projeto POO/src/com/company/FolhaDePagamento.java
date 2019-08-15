package com.company;
import com.company.Funcionario.Funcionario;
import java.util.Calendar;
import java.util.ArrayList;

public class FolhaDePagamento {

    public FolhaDePagamento() {
    }

    public void pay (ArrayList<Funcionario> funcionarios, ArrayList<String> agenda, Calendar data, int lastDay, int dayC){
        int i;
        System.out.println("--------------------------------------------------");
        for (i = 0; i < funcionarios.size(); i++){
            String[] aux = funcionarios.get(i).getpayDay().split(" ");
            if (checkAgenda(aux, agenda, data, lastDay, dayC)){
                funcionarios.set(i, setSalary(funcionarios.get(i)));
                System.out.printf("Funcionário: %s\nID: %s\nPagamento: %.2f\nStatus", funcionarios.get(i).getName(), funcionarios.get(i).getId(), funcionarios.get(i).getTotalSalary());
                if (funcionarios.get(i).getPayType() == 1) System.out.println("Status: Depósito efetuado");
                else if (funcionarios.get(i).getPayType() == 2) System.out.println("Status: Cheque enviado para " + funcionarios.get(i).getAddress());
                else System.out.println("Status: Cheque entregue");
                System.out.println("--------------------------------------------------");
                funcionarios.get(i).setTotalSalary(0);
            }
        }
    }

    public boolean checkAgenda (String[] payday, ArrayList<String> agenda, Calendar data,int lastDay,  int dayC){
        int i;
        for (i = 0; i < agenda.size(); i++){
            String[] aux = agenda.get(i).split(" ");
            if (payday[0].equals("semanal")){
                if (payday[0].equals(aux[0]) && payday[1].equals(aux[1]) && payday[2].equals(aux[2])){
                    return checkData(payday, data, lastDay, dayC);
                }
            }
            else if (payday[0].equals(aux[0]) && payday[1].equals(aux[1])){
                return checkData(payday, data, lastDay, dayC);
            }
        }
        return false;
    }

    public boolean checkData (String[] payday, Calendar data, int lastDay, int dayC){
        if (payday[0].equals("mensal")){
            int day = data.get(Calendar.DAY_OF_MONTH);
            if (payday[1].equals("$") && day == lastDay) return true;
            else if (payday[1].equals(Integer.toString(day))) return true;
        }
        else{
            if (payday[1].equals("1")){
                switch (payday[2].toLowerCase()) {
                    case "domingo":
                        if(data.get(Calendar.DAY_OF_WEEK) == 1)
                            return true;
                        break;
                    case "segunda":
                        if(data.get(Calendar.DAY_OF_WEEK) == 2)
                            return true;
                        break;
                    case "terça":
                        if(data.get(Calendar.DAY_OF_WEEK) == 3)
                            return true;
                        break;
                    case "quarta":
                        if(data.get(Calendar.DAY_OF_WEEK) == 4)
                            return true;
                        break;
                    case "quinta":
                        if(data.get(Calendar.DAY_OF_WEEK) == 5)
                            return true;
                        break;
                    case "sexta":
                        if(data.get(Calendar.DAY_OF_WEEK) == 6)
                            return true;
                        break;
                    case "sábado":
                        if(data.get(Calendar.DAY_OF_WEEK) == 7)
                            return true;
                        break;
                }
            }
            else {
                if ((dayC - 7) >= 0){
                    switch (payday[2].toLowerCase()) {
                        case "domingo":
                            if(data.get(Calendar.DAY_OF_WEEK) == 1)
                                return true;
                            break;
                        case "segunda":
                            if(data.get(Calendar.DAY_OF_WEEK) == 2)
                                return true;
                            break;
                        case "terça":
                            if(data.get(Calendar.DAY_OF_WEEK) == 3)
                                return true;
                            break;
                        case "quarta":
                            if(data.get(Calendar.DAY_OF_WEEK) == 4)
                                return true;
                            break;
                        case "quinta":
                            if(data.get(Calendar.DAY_OF_WEEK) == 5)
                                return true;
                            break;
                        case "sexta":
                            if(data.get(Calendar.DAY_OF_WEEK) == 6)
                                return true;
                            break;
                        case "sábado":
                            if(data.get(Calendar.DAY_OF_WEEK) == 7)
                                return true;
                            break;
                    }
                }
            }
        }
        return false;
    }

    public Funcionario setSalary (Funcionario aux){
        return aux.calcularSalario();
    }


}
