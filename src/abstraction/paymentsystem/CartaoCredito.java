package abstraction.paymentsystem;

public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;
    private String dataValidade;
    private String cvv;

    public CartaoCredito(String numeroCartao, String dataValidade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Processando pagamento com Cartão de Crédito no valor de: R$" + valor);
        } else {
            System.out.println("Pagamento com Cartão de Crédito no valor de: R$" + valor + " foi cancelado.");
        }
    }

    @Override
    public boolean validarPagamento() {
        return validarNumeroCartao() && validarCVV() && validarDataValidade();
    }

    private boolean validarNumeroCartao() {
        if (numeroCartao.length() == 16) {
            System.out.println("Número do cartão de crédito válido: " + numeroCartao);
            return true;
        } else {
            System.out.println("Número do cartão de crédito inválido.");
            return false;
        }
    }

    private boolean validarCVV() {
        if (cvv.length() == 3) {
            System.out.println("CVV do cartão de crédito válido.");
            return true;
        } else {
            System.out.println("CVV do cartão de crédito inválido.");
            return false;
        }
    }

    private boolean validarDataValidade() {
        if (dataValidade.compareTo("09/24") >= 0) {
            System.out.println("Cartão ainda está válido.");
            return true;
        } else {
            System.out.println("Cartão expirado.");
            return false;
        }
    }
}
