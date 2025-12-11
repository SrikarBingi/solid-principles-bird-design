package solidprinciples.OCP;

public class SparrowOCP extends BirdOCP implements FlyableOCP{

    public SparrowOCP() {
        super("Sparrow");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying with standard wing flapping");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow: Chirp chirp!");
    }
}
