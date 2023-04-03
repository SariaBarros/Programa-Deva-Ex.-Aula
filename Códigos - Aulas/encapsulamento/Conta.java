package encapsulamento;

public class Conta {
    private String titular;
    private String numeroConta;
    private String cpf;
    private Double saldo;

    public Conta(String titular, String numeroConta, String cpf, Double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.cpf = cpf;
        this.saldo = saldo;
    }
//getters
    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    //Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSaldo(Double saldo) {
        if(saldo >= 0){
            this.saldo = saldo;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                "\n numeroConta='" + numeroConta + '\'' +
                "\n cpf='" + cpf + '\'' +
                "\n saldo=" + saldo +
                '}' + "\n";
    }
}
