package pagamento;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        System.out.println("Entre com uma forma de pagamento:");
        System.out.printf("1 - Pix\n2 - Dinheiro\n3 - Prazo\n4 - Débito\n5 - Crédito\n");
        Scanner in = new Scanner(System.in);
        int operacao = in.nextInt();
        in.close();

        FormaDePagamento entrada = FormaDePagamento.values()[--operacao];

        switch (entrada){
            case PIX -> System.out.println("Você escolheu pix");
            case DINHEIRO -> System.out.println("Você escolheu dinheiro");
            case A_PRAZO -> System.out.println("Prazo");
            case CARTAO_DE_DEBITO -> System.out.println("debito");
            case CARTAO_DE_CREDITO -> System.out.println("credito");
            default -> System.out.println("não listado");
        }
    }
}
