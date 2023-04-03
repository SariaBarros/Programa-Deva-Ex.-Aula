package imposto;

public class Main {
    public static void main(String[] args) {
        Contribuinte pessoaFisica = new PessoaFisica("Sandy", 1000, TipoPessoa.PF, "12345678");
        pessoaFisica.calcularImposto();
    }
}
