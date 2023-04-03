package encapsulamento;

public class Agencia {
    public static void main(String[] args) {
        Conta contaMAria = new Conta("Maria", "123456", "123.456.789-10", 5000.00);
        Conta contaJose = new Conta("Jose", "654321", "111.111.111-11", 40.00);

        sacar(1500.00, contaMAria);
        transferir(100.00, contaMAria, contaJose);
        pagar(500.00, contaMAria);
        System.out.println(contaMAria);
        System.out.println(contaJose);
    }
    public static void sacar(Double valor, Conta conta){
        conta.setSaldo(conta.getSaldo()-valor);
    }

    public static void transferir(Double valor, Conta contaOrigem, Conta contaDestino){
        contaOrigem.setSaldo(contaOrigem.getSaldo()-valor);
        contaDestino.setSaldo(contaDestino.getSaldo()+valor);
    }
    public static void pagar (Double valor, Conta conta){
        conta.setSaldo(conta.getSaldo()-valor);
    }

}
