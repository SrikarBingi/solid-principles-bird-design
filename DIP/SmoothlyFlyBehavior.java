package solidprinciples.DIP;

public class SmoothlyFlyBehavior implements FlyBehavior{
    @Override
    public void performFly() {
        System.out.println("Flying smoothly with gentle wing movements");
    }
}
