package polymorphism.interfaces;

public class Trem implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("O trem acelera ao aumentar a potência através da alavanca de controle.");
    }

    @Override
    public void frear() {
        System.out.println("O trem está freando ao acionar o sistema de freios pneumáticos.");
    }
}
