package solidprinciples.LSP;

public class SparrowLSP extends FlyingBirdLSP{
    public SparrowLSP() {
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
