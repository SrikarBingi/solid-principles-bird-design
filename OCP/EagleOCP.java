package solidprinciples.OCP;

public class EagleOCP extends BirdOCP implements FlyableOCP{

    public EagleOCP() {
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is soaring high");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Eagle: Screech!");
    }

}
