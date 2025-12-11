package solidprinciples.OCP;

public class PegionOCP extends BirdOCP implements FlyableOCP{

    public PegionOCP() {
        super("Pegion");
        
    }

    @Override
    public void fly() {
       System.out.println("Pigeon is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Pigeon: Coo coo!");
    }

}
