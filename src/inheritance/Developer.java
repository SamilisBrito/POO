package inheritance;

public class Developer extends Employee {
    public Developer(String nome, double salary) {
        super(nome, salary);
    }

    public double calcularBonus() {
        return salary * 0.10;
    }

    @Override
    public String trabalhar() {
        return "Codar para pagar as dívidas";
    }
}
