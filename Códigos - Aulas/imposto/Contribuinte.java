package imposto;

public class Contribuinte {
    private String nome;
    private double renda;
    private TipoPessoa tipoPessoa;


    public Contribuinte(String nome, double renda, TipoPessoa tipoPessoa) {
        this.nome = nome;
        this.renda = renda;
        this.tipoPessoa = tipoPessoa;
    }

    public double calcularImposto(){
        double imposto = getRenda() * 0.2;
        System.out.println("O contribuinte " + getNome()+ " ira pagar " + imposto);
        return imposto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    @Override
    public String toString() {
        return "Contribuinte{" +
                "nome='" + nome + '\'' +
                ", renda='" + renda + '\'' +
                ", tipoPessoa=" + tipoPessoa +
                '}';
    }
}
