package abstraction.paymentsystem;

public class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Processando pagamento via Pix no valor de: R$" + valor);
        } else {
            System.out.println("Processamento via Pix no valor de: R$" + valor + " cancelado");
        }
    }

    @Override
    protected boolean validarPagamento() {
        String tipoChavePix = getTipoChavePix();
        if (tipoChavePix != null) {
            System.out.println("Chave Pix válida (" + tipoChavePix + "): " + chavePix);
            return true;
        } else {
            System.out.println("Chave Pix inválida!");
            return false;
        }
    }

    private String getTipoChavePix() {
        if (chavePix.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            return "E-mail";
        } else if (chavePix.matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$")) {
            return "CPF";
        } else if (chavePix.matches("\\d{9,11}")) {
            return "Telefone";
        }
        return null;
    }
}
