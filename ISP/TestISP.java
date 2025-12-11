package solidprinciples.ISP;

public class TestISP {
    public static void main(String[] args) {
        System.out.println("\n=== ISP APPROACH ===\n");
        
        // Using specific interfaces
        System.out.println("--- Flying Birds ---");
        Flies[] fliers = {
            new PigeonISP(),
            new CrowISP(),
            new DuckISP() // Duck can fly
        };
        
        for (Flies flier : fliers) {
            flier.fly();
        }
        
        System.out.println("\n--- Swimming Birds ---");
        Swims[] swimmers = {
            new PenguinISP(),
            new DuckISP() // Duck can also swim!
        };
        
        for (Swims swimmer : swimmers) {
            swimmer.swim();
        }
        
        System.out.println("\n--- Running Birds ---");
        Runs runner = new OstrichISP();
        runner.run();
        
        // ✓ Duck example shows flexibility
        System.out.println("\n--- Duck: Multi-talented ---");
        DuckISP duck = new DuckISP();
        duck.eat();
        duck.sound();
        duck.fly();
        duck.swim();
    }
}
