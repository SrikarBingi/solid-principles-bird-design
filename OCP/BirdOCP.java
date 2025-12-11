package solidprinciples.OCP;

public abstract class BirdOCP implements EatableOCP, SoundableOCP{
    protected String name;
    
    public BirdOCP(String name) {
        this.name = name;
    }
    
    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    // Abstract - each bird makes different sound
    @Override
    public abstract void makeSound();
}
