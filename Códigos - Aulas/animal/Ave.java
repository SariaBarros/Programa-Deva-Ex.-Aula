package animal;

public class Ave extends Animal{
    private boolean voa;

    public Ave(String nome, String cor, String ambiente, double velocidadeMedia, boolean voa) {
        super(nome, cor, ambiente, velocidadeMedia);
        this.voa = voa;
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public void voar(){

    }

    @Override
    public String toString() {
        return "Ave{" +
                "Nome: " + getNome()+ "\n" +
                "Cor: " + getCor() + "\n" +
                "voa=" + voa +
                '}';
    }
}
