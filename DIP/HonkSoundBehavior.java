package solidprinciples.DIP;

public class HonkSoundBehavior implements SoundBehavior{
    @Override
    public void performSound() {
        System.out.println("Honk honk!");
    }
}
