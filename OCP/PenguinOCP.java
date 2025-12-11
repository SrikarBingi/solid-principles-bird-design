package solidprinciples.OCP;

public class PenguinOCP extends BirdOCP implements SwimmableOCP{

    public PenguinOCP() {
        super("Penguin");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin: Honk honk!");
    }

}
