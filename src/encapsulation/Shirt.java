package encapsulation;

public class Shirt extends Product{
    private double discountValue;

    public Shirt(String nome, double price, int quantity) {
        super(nome, price, quantity);
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 50) {
            throw new IllegalArgumentException("Máximo de desconto é 50%");
        }
        discountValue = (porcentagem / 100) * getPrice();
        setPrice(getPrice() - discountValue);
    }

    public double getDiscount() {
        return discountValue;
    }
}
