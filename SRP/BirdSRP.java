package solidprinciples;

public abstract class BirdSRP {

    protected String name;

    public BirdSRP(String name) {
        this.name = name;
    }
    
    // Common behavior - all birds eat
    public void eat() {
        System.out.println(name + " is eating seeds and insects");
    }
    
    // Each bird makes different sound - abstract method
    public abstract void makeSound();
}
