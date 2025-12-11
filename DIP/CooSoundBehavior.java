package solidprinciples.DIP;

public class CooSoundBehavior implements SoundBehavior{
    @Override
    public void performSound() {
        System.out.println("Coo coo coo!");
    }
}
