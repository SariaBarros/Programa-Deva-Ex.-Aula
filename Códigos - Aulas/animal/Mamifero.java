package animal;

public class Mamifero extends Animal{
    private int quantidadePatas;


    public Mamifero(String nome, String cor, String ambiente, double velocidadeMedia, int quantidadePatas) {
        super(nome, cor, ambiente, velocidadeMedia);
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    public void amamentar(){

    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "Nome: " + getNome()+ "\n" +
                "Cor: " + getCor() + "\n" +
                "quantidadePatas=" + quantidadePatas +
                '}';
    }
}
