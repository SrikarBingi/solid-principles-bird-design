package solidprinciples.ISP;

public class PigeonISP extends BirdISP implements Flies{


    public PigeonISP() {
        super("Pigeon");
    }

    @Override
    public void sound() {
        System.out.println("Pigeon: Coo coo!");
    }

    @Override
    public void fly() {
        System.out.println("Pigeon is flying");
    }

}
