package animal;

public class Main {
    public static void main(String[] args) {
        Ave pinguin = new Ave("pinguin", "preto", "antartida", 10, false);
        Mamifero camelo = new Mamifero("camelo", "marrom", "deserto", 40, 4);


        System.out.println(pinguin);
        System.out.println(camelo);
    }
}
