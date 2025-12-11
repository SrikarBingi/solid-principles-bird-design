package solidprinciples.DIP;

public class NoFlyBehavior implements FlyBehavior{
    @Override
    public void performFly() {
        System.out.println("Cannot fly - wings not suitable for flight");
    }
}
