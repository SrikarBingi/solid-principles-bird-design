package solidprinciples.DIP;

public class BoomSoundBehavior implements SoundBehavior{
    @Override
    public void performSound() {
        System.out.println("Boom boom!");
    }
}
