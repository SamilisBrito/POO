package inheritance;

public class Employee {
    protected String nome;
    protected double salary;

    public Employee(String nome, double salary) {
        this.nome = nome;
        this.salary = salary;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String trabalhar() {
        return "Pagar as dívidas";
    }
}
