package solidprinciples.LSP;

public class CrowLSP extends FlyingBirdLSP{
    public CrowLSP() {
        super("Crow");
    }
    
    @Override
    public void fly() {
        System.out.println("Crow is flying with standard wing flapping");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Crow: Caw caw!");
    }
}
