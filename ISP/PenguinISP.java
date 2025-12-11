package solidprinciples.ISP;

public class PenguinISP extends BirdISP implements Swims{

    public PenguinISP() {
        super("Penguin");
    }
    
    @Override
    public void swim() {
        System.out.println("Penguin is swimming gracefully");
    }
    
    @Override
    public void sound() {
        System.out.println("Penguin: Honk honk!");
    }
}
