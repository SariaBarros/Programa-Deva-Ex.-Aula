package imposto;

public class PessoaFisica extends Contribuinte{
    private String cpf;

    public PessoaFisica(String nome, double renda, TipoPessoa tipoPessoa, String cpf) {
        super(nome, renda, tipoPessoa);
        this.cpf = cpf;
    }

    @Override
    public double calcularImposto() {
       double imposto = getRenda() * 0.15;
       System.out.println("O contribuinte " + getNome()+ " ira pagar " + imposto);
       return imposto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() + "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                '}';
    }
}
