package solidprinciples.DIP;

public class StandardFlyBehavior implements FlyBehavior{
    public void performFly() {
        System.out.println("Flying with standard wing flapping - common for small birds");
    }
}
