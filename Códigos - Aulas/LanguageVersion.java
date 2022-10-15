import java.util.Scanner;

public class LanguageVersion {
    public static void main(String[] args) {
        System.out.printf("Informe uma linguagem:\n");
        Scanner in = new Scanner(System.in);
        String linguagem = in.next();
        linguagem = linguagem.toUpperCase();
        in.close();
        Linguagem entrada = Linguagem.valueOf(linguagem);

        switch (entrada){
            case JAVA:
            case KOTLIN:
                System.out.println("Compilada");
                break;
            case PHP:
            case JAVASCRIPT:
                System.out.println("Interpretada");
                break;
            default:
                System.out.println("Linguagem não encontrada");
        }
    }
}
