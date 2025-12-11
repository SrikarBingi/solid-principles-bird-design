package solidprinciples.DIP;

public class CawSoundBehavior implements SoundBehavior{
    @Override
    public void performSound() {
        System.out.println("Caw caw caw!");
    }
}
