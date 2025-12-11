package solidprinciples.DIP;

public class TestDIP {
    public static void main(String[] args) {
        System.out.println("\n=== DIP APPROACH (FINAL DESIGN) ===\n");
        // Create all birds
        BirdDIP pigeon = new PigeonDIP();
        BirdDIP crow = new CrowDIP();
        BirdDIP sparrow = new SparrowDIP();
        PenguinDIP penguin = new PenguinDIP();
        OstrichDIP ostrich = new OstrichDIP();
        
        // All birds can eat and make sound
        System.out.println("--- All Birds: Common Behaviors ---");
        BirdDIP[] allBirds = {pigeon, crow, sparrow, penguin, ostrich};
        
        for (BirdDIP bird : allBirds) {
            bird.performEat();
            bird.performSound();
            System.out.println();
        }
        
        // Flying birds
        System.out.println("--- Flying Birds ---");
        pigeon.performFly();
        crow.performFly();   // ✓ Same as Sparrow
        sparrow.performFly(); // ✓ Same as Crow
        System.out.println();
        
        // Non-flying birds
        System.out.println("--- Non-Flying Birds ---");
        penguin.performFly();
        ostrich.performFly();
        System.out.println();
        
        // Specific behaviors
        System.out.println("--- Specific Abilities ---");
        penguin.swim();
        ostrich.run();
        System.out.println();
        
        // ✓ Runtime behavior change demo!
        System.out.println("--- Runtime Behavior Change ---");
        System.out.println("Training penguin to fly (hypothetically):");
        penguin.setFlyBehavior(new FlyBehavior() {
            @Override
            public void performFly() {
                System.out.println("Penguin learned to glide short distances!");
            }
        });
        penguin.performFly();
    }
}
