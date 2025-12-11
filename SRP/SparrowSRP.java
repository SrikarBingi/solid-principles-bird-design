package solidprinciples;

public class SparrowSRP extends BirdSRP{
    public SparrowSRP() {
        super("Sparrow");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Sparrow: Chirp chirp chirp!");
    }
    
    public void fly() {
        System.out.println("Sparrow is flying with standard wing flapping");
    }
}
