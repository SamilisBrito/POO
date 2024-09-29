package abstraction.paymentsystem;

public class Boleto extends FormaPagamento {
    private String codigoBarras;
    private String dataVencimento;

    public Boleto(String codigoBarras, String dataVencimento) {
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Gerando boleto no valor de: R$" + valor);
            System.out.println("Aguarde a confirmação do pagamento.");
        } else {
            System.out.println("Pagamento com boleto no valor de: R$" + valor + " foi cancelado.");
        }
    }

    @Override
    public boolean validarPagamento() {
        boolean codigoValido = validarCodigoBarras();
        boolean vencimentoValido = validarDataVencimento();

        return codigoValido && vencimentoValido;
    }

    private boolean validarCodigoBarras() {
        if (codigoBarras.length() == 47) {
            System.out.println("Código de barras do boleto válido: " + codigoBarras);
            return true;
        } else {
            System.out.println("Código de barras do boleto inválido.");
            return false;
        }
    }

    private boolean validarDataVencimento() {
        if (dataVencimento.compareTo("09/24") >= 0) {
            System.out.println("Boleto dentro do prazo.");
            return true;
        } else {
            System.out.println("Boleto vencido.");
            return false;
        }
    }
}
