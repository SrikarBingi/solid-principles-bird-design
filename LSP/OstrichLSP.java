package solidprinciples.LSP;

public class OstrichLSP extends BirdLSP{
    public OstrichLSP() {
        super("Ostrich");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Ostrich: Boom boom!");
    }
    
    public void run() {
        System.out.println("Ostrich is running");
    }
}
