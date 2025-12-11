package solidprinciples.LSP;

public class TestLSP {
    public static void main(String[] args) {
        System.out.println("\n=== LSP APPROACH ===\n");
        
        // ✓ LSP satisfied: FlyingBird_LSP reference works for all flying birds
        FlyingBirdLSP[] flyingBirds = {
            new PigeonLSP(),
            new CrowLSP(),
            new SparrowLSP()
        };
        
        System.out.println("Processing flying birds:");
        for (FlyingBirdLSP bird : flyingBirds) {
            bird.eat();      // Works
            bird.makeSound(); // Works
            bird.fly();      // Works - no type casting needed!
            System.out.println();
        }
        
        // ✓ Bird_LSP reference for all birds (common behavior)
        BirdLSP[] allBirds = {
            new PigeonLSP(),
            new PenguinLSP(),
            new OstrichLSP()
        };
        
        System.out.println("All birds making sound:");
        for (BirdLSP bird : allBirds) {
            bird.makeSound(); // Works for all
        }
    }
}
