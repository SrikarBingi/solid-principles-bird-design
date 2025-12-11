package solidprinciples.ISP;

public class SparrowISP extends BirdISP implements Flies{

    public SparrowISP() {
        super("Sparrow");
    }
    
    @Override
    public void fly() {
        System.out.println("Sparrow is flying with standard wing flapping");
    }
    
    @Override
    public void sound() {
        System.out.println("Sparrow: Chirp chirp!");
    }
}
