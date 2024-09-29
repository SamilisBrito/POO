package polymorphism.interfaces;

public class Carro implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("O carro acelera ao pressionar o pedal do acelerador.");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando ao pressionar o pedal de freio.");
    }
}
