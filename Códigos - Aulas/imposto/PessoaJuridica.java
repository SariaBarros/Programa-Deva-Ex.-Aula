package imposto;

public class PessoaJuridica extends Contribuinte{
    private String cnpj;

    public PessoaJuridica(String nome, double renda, TipoPessoa tipoPessoa, String cnpj) {
        super(nome, renda, tipoPessoa);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                '}';
    }

    @Override
    public double calcularImposto() {
       double imposto = getRenda() * 0.25;
       System.out.println("O contribuinte " + getNome()+ " ira pagar " + imposto);
       return imposto;
    }
}
