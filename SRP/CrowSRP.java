package solidprinciples;

public class CrowSRP extends BirdSRP{

    public CrowSRP() {
        super("Crow");
    }

    @Override
    public void makeSound() {
        System.out.println("Crow: Caw caw caw!");
    }
    
    public void fly() {
        System.out.println("Crow is flying with standard wing flapping");
    }

}
