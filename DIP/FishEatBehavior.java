package solidprinciples.DIP;

public class FishEatBehavior implements EatBehavior{
    @Override
    public void performEat() {
        System.out.println("Eating fish");
    }
}
