package solidprinciples;

public class TestSRP {
    public static void main(String[] args) {
        System.out.println("\n=== SRP APPROACH ===\n");
        
        PigeonSRP pigeon = new PigeonSRP();
        pigeon.eat();
        pigeon.makeSound();
        pigeon.fly();
        System.out.println();
        
        PenguinSRP penguin = new PenguinSRP();
        penguin.eat();
        penguin.makeSound();
        // penguin.fly(); // no fly() method - no confusion
        penguin.swim();
        System.out.println();
        
        CrowSRP crow = new CrowSRP();
        crow.fly();
        
        SparrowSRP sparrow = new SparrowSRP();
        sparrow.fly(); // crow, sparrow Both same way fly but code duplicate
    }
}
