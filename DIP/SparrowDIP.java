package solidprinciples.DIP;

public class SparrowDIP extends BirdDIP{
    public SparrowDIP() {
        super("Sparrow",
        new StandardFlyBehavior(), // Same behavior as Crow!
        new ChirpSoundBehavior(),
        new SeedsAndInsectsEatBehavior());
    }
}
