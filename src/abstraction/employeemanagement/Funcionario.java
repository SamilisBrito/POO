package abstraction.employeemanagement;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public abstract double calcularBonus();

    public void promover(String novoCargo) {
        if (novoCargo.equalsIgnoreCase("Gerente")) {
            this.salarioBase *= 1.2;
        } else if (novoCargo.equalsIgnoreCase("Desenvolvedor")) {
            this.salarioBase *= 1.1;
        }
        System.out.println(nome + " foi promovido para " + novoCargo);
    }
}







