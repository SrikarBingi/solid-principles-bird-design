package solidprinciples.LSP;

public class PigeonLSP extends FlyingBirdLSP{

    public PigeonLSP() {
        super("Pigeon");
    }
    @Override
    public void makeSound() {
        System.out.println("Pigeon: Coo coo!");
    }
}
