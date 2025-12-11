package solidprinciples.ISP;

public class DuckISP extends BirdISP implements Flies, Swims{

    public DuckISP() {
        super("Duck");
    }
    
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
    
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
    
    @Override
    public void sound() {
        System.out.println("Duck: Quack quack!");
    }
}
