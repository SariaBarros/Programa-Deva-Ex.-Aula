package petshop;

public class Animal {
    String specie;
    String animalName;
    String tutorName;

    public Animal() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "specie='" + specie + '\'' +
                ", animalName='" + animalName + '\'' +
                ", tutorName='" + tutorName + '\'' +
                '}';
    }
}
