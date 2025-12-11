package solidprinciples;

public class PigeonSRP extends BirdSRP {

    public PigeonSRP() {
        super("Pigeon");
        //TODO Auto-generated constructor stub
    }

    @Override
    public void makeSound() {
       System.out.println("Pigeon: Coo coo coo!");
    }
    public void fly() {
        System.out.println("Pigeon is flying smoothly");
    }
}
