package solidprinciples.ISP;

public class CrowISP extends BirdISP implements Flies{

    public CrowISP() {
        super("Crow");
    }
    
    @Override
    public void fly() {
        System.out.println("Crow is flying with standard wing flapping");
    }
    
    @Override
    public void sound() {
        System.out.println("Crow: Caw caw!");
    }
}
