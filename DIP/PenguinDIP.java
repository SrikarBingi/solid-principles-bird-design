package solidprinciples.DIP;

public class PenguinDIP extends BirdDIP{
    public PenguinDIP() {
        super("Penguin",
        new NoFlyBehavior(), // Cannot fly
        new HonkSoundBehavior(),
        new FishEatBehavior()); // Eats fish
    }
    // Penguin specific behavior
    public void swim() {
        System.out.println(name + " is swimming gracefully in cold water");
    }
}
