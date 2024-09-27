package inheritance;

public class Manager extends Employee {
    public Manager(String nome, double salary) {
        super(nome, salary);
    }

    public double calcularBonus() {
        return salary * 0.20;
    }

    @Override
    public String trabalhar(){
        return "Gerenciar os outros para pagar as dívidas";
    }
}
