package solidprinciples.LSP;

public abstract class BirdLSP implements CanEatLSP, CanMakeSoundLSP{
    protected String name;
    
    public BirdLSP(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    // Each bird makes unique sound
    @Override
    public abstract void makeSound();
}
