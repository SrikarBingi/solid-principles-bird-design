package solidprinciples;

public class OstrichSRP extends BirdSRP{
    
    public OstrichSRP() {
        super("Ostrich");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Ostrich: Boom boom!");
    }
    
    // Ostrich specific - no fly(), but can run
    public void run() {
        System.out.println("Ostrich is running at 70 km/h");
    }
}
