package solidprinciples.OCP;

public class TestOCP {
    public static void main(String[] args) {
        System.out.println("\n=== OCP APPROACH ===\n");
        
        // Polymorphism - Flyable reference
        FlyableOCP[] flyingBirds = {
            new PegionOCP(),
            new CrowOCP(),
            new SparrowOCP(),
            new EagleOCP() // ✓ New bird added without modifying existing code
        };
        
        System.out.println("All flying birds:");
        for (FlyableOCP bird : flyingBirds) {
            bird.fly();
        }
        System.out.println();
        
        // Non-flying birds
        PenguinOCP penguin = new PenguinOCP();
        penguin.eat();
        penguin.makeSound();
        penguin.swim();
    }
}
