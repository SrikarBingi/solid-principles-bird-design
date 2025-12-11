package solidprinciples.ISP;

public class OstrichISP extends BirdISP implements Runs{

    public OstrichISP() {
        super("Ostrich");
    }
    
    @Override
    public void run() {
        System.out.println("Ostrich is running at 70 km/h");
    }
    
    @Override
    public void sound() {
        System.out.println("Ostrich: Boom boom!");
    }
}
