package solidprinciples;

public class PenguinSRP extends BirdSRP{

    public PenguinSRP() {
        super("Penguin");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Penguin: Honk honk!");
    }
    
    // Penguin specific - no fly(), but can swim
    public void swim() {
        System.out.println("Penguin is swimming gracefully");
    }
}
