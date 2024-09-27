import encapsulation.Product;
import inheritance.Developer;
import inheritance.Manager;

public class Main {
    public static void main(String[] args) {
        Product produto1 = new Product("Tal", 12, 17);
        System.out.println("Nome:" + produto1.getName() + " Preço:" + produto1.getPrice() + " Quantidade:" + produto1.getQuantity());

        Manager gerente1 = new Manager("Samilis", 10000);
        Developer developer = new Developer("Lucas", 10000);

        System.out.println("Nome:" + gerente1.getNome() + " Salario:" + gerente1.getSalary() + " Bonus:" + gerente1.calcularBonus() + " Trabalho é: "+ gerente1.trabalhar());
        System.out.println("Nome:" + developer.getNome() + " Salario:" + developer.getSalary() + " Bonus:" + developer.calcularBonus()  + " Trabalho é: "+ developer.trabalhar());

    }
}