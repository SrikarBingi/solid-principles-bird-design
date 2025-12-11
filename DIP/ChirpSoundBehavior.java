package solidprinciples.DIP;

public class ChirpSoundBehavior implements SoundBehavior{
    @Override
    public void performSound() {
        System.out.println("Chirp chirp chirp!");
    }
}
