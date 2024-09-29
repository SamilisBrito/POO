package polymorphism.interfaces;

public class Bicicleta implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("A bicicleta está acelerando enquanto você pedala com mais força.");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando ao acionar os manetes do guidão.");
    }
}
