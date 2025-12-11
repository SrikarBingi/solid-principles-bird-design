package solidprinciples.DIP;

public class SeedsAndInsectsEatBehavior implements EatBehavior{
    @Override
    public void performEat() {
        System.out.println("Eating seeds and insects");
    }
}
