package solidprinciples.DIP;

public class PigeonDIP extends BirdDIP{
    public PigeonDIP() {
        super("Pigeon",
        new SmoothlyFlyBehavior(),
        new CooSoundBehavior(),
        new SeedsAndInsectsEatBehavior());
    }
}
