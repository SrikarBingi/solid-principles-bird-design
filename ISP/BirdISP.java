package solidprinciples.ISP;

public abstract class BirdISP implements Eats, MakesSound{
    protected String name;
    
    public BirdISP(String name) {
        this.name = name;
    }
    
    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }
}
