package solidprinciples.OCP;

public class CrowOCP extends BirdOCP implements FlyableOCP{

    public CrowOCP() {
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
