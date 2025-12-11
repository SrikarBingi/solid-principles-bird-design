package solidprinciples.LSP;

public class PenguinLSP extends BirdLSP{
    public PenguinLSP() {
        super("Penguin");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Penguin: Honk honk!");
    }
    
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
