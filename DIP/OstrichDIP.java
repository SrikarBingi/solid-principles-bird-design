package solidprinciples.DIP;

public class OstrichDIP extends BirdDIP{
    public OstrichDIP() {
        super("Ostrich",
        new NoFlyBehavior(), // Cannot fly
        new BoomSoundBehavior(),
        new SeedsAndInsectsEatBehavior());
    }
    // Ostrich specific behavior
    public void run() {
        System.out.println(name + " is running at 70 km/h - fastest bird on land!");
    }
}
