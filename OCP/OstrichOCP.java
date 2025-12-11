package solidprinciples.OCP;

public class OstrichOCP extends BirdOCP implements RunnableOCP{

    public OstrichOCP() {
        super("Ostrich");
    }

    @Override
    public void run() {
        System.out.println("Ostrich is running fast");
    }

    @Override
    public void makeSound() {
        System.out.println("Ostrich: Boom boom!");
    }

}
