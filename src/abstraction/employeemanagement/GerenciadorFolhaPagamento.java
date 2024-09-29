package abstraction.employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorFolhaPagamento {
    private List<Funcionario> funcionarios;

    public GerenciadorFolhaPagamento() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void calcularFolhaPagamento() {
        double totalSalarios = 0;
        double totalBonuses = 0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularSalario();
            double bonus = funcionario.calcularBonus();
            totalSalarios += salario;
            totalBonuses += bonus;

            System.out.println("Funcionário: " + funcionario.nome +
                    ", Salário: " + salario +
                    ", Bônus: " + bonus);
        }

        System.out.println("Total Salários: " + totalSalarios);
        System.out.println("Total Bônus: " + totalBonuses);
    }
}
