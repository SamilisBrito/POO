package abstraction.paymentsystem;

public abstract class FormaPagamento {
    public abstract void processarPagamento(double valor);

    protected abstract boolean validarPagamento();
}
