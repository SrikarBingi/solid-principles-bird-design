package solidprinciples.DIP;

public class BirdDIP {
    protected String name;
    protected FlyBehavior flyBehavior;      // Dependency on abstraction
    protected SoundBehavior soundBehavior;  // Dependency on abstraction
    protected EatBehavior eatBehavior;      // Dependency on abstraction
    
    // Constructor injection - behaviors injected
    public BirdDIP(String name, FlyBehavior flyBehavior, 
                    SoundBehavior soundBehavior, EatBehavior eatBehavior) {
        this.name = name;
        this.flyBehavior = flyBehavior;
        this.soundBehavior = soundBehavior;
        this.eatBehavior = eatBehavior;
    }
    public void performFly() {
        System.out.print(name + ": ");
        flyBehavior.performFly();
    }

    public void performSound() {
        System.out.print(name + ": ");
        soundBehavior.performSound();
    }

    public void performEat() {
        System.out.print(name + ": ");
        eatBehavior.performEat();
    }

    // ✓ Runtime behavior change possible!
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setSoundBehavior(SoundBehavior sb) {
        this.soundBehavior = sb;
    }
}
