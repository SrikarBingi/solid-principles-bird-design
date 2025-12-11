package solidprinciples.DIP;

public class CrowDIP extends BirdDIP{
    public CrowDIP() {
        super("Crow",
        new StandardFlyBehavior(), // Same behavior
        new CawSoundBehavior(),
        new SeedsAndInsectsEatBehavior());
    }
}
