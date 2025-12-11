package solidprinciples;

public class TestNaive {
    public static void main(String[] args) {
        System.out.println("=== NAIVE APPROACH ===\n");
        
        BirdNaive pigeon = new BirdNaive("Pigeon");
        pigeon.eat();
        pigeon.makeSound();
        pigeon.fly();
        System.out.println();
        
        BirdNaive penguin = new BirdNaive("Penguin");
        penguin.eat();
        penguin.makeSound();
        penguin.fly(); // Problem: fly() method but penguin cant fly
        System.out.println();
        
        BirdNaive crow = new BirdNaive("Crow");
        crow.fly();
    }
}

// ============================================
// STEP 1: Naive Approach
// ============================================

/*
PROBLEMS with Naive Approach:
1. If-else chains 
2. to add new bird  fly(), makeSound() should be modifies
3. Penguin, Ostrich exposes fly() method (confusing)
4. Crow, Sparrow fly in same way but not mentioned in code
5. Testing becomes tough
6. Code duplication

we have to apply solid principles to overcome these
*/


// ============================================
// STEP 2: SRP — Single Responsibility Principle
// ============================================

/*
SRP Definition:
"A class should have only ONE reason to change"
"A class should have only one responsibility."

When should we apply SRP?
- When a class is doing many different things
- When a class has multiple reasons to change
- When the methods inside a class are not related to each other

What we will do now:
- Create a separate class for each bird type
- Each class will handle its own behavior
*/

/*
After SRP — Improvements:

1. Each bird class has only one responsibility → its own behavior
2. No long if–else chains
3. Penguin does NOT have a fly() method → clear interface separation
4. Code is easy to read and understand
5. Each bird can be tested independently

Still Problems:

1. Crow and Sparrow have duplicate fly() code
2. When adding a new flying bird, we need to rewrite fly() again
3. We still cannot share common flying behavior
4. We are not fully using polymorphism

Next Step: Apply OCP (Open/Closed Principle)

We will solve these problems using OCP.

// ============================================
// STEP 3: OCP — Open Closed Principle
// ============================================

OCP Definition:

"Software entities should be OPEN for extension but CLOSED for modification."

Meaning:

You should be able to add new features (open for extension)

Without modifying existing classes (closed for modification)

When to Apply OCP?

Apply OCP when:

You are modifying existing code every time you add new functionality

When adding a new type requires multiple changes across the system

When you have many if–else or switch statements

Solution:

Use Interfaces + Abstraction to enable extension without modification.
 */


/*
After OCP — Improvements:
1. We can add new birds without modifying existing classes
2. Interface-based design makes the system flexible
3. Flying birds can be identified easily (using the Flyable interface)
4. Full polymorphism benefits — we can use a Flyable[] array

Still Problems:
1. Crow and Sparrow still have duplicate fly() code
2. We still cannot share common flying behavior
3. We cannot call fly() using a Bird_OCP reference (requires type-casting)

Next: With LSP we will fix the parent-child relationship...
*/


// ============================================
// STEP 4: LSP — Liskov Substitution Principle
// ============================================

/*
LSP Definition:
"A child class should be substitutable for its parent class without breaking functionality."
"A child class must replace the parent class without causing issues."

When should we apply LSP?
- When the child class breaks or violates the behavior of the parent
- When we rely heavily on type checking (instanceof)
- When a parent reference cannot be used with child objects
- When a child doesn’t follow the parent’s contract (throws unexpected exceptions)

Problem in the Previous Design:
We have a Bird_OCP base class, but it does NOT contain fly() behavior.
So a Bird_OCP reference cannot guarantee flying behavior.

// ============================================
// STEP 5: ISP — Interface Seggregation Principle
// ============================================

Solution:
Create proper abstractions that correctly represent the parent–child relationship.
*/

/*
IMPROVEMENTS after applying ISP:
1. Separate, focused interfaces — no unnecessary methods
2. Birds only implement abilities they actually use (Flyable, Swimmable, etc.)
3. No empty or “not supported” method implementations
4. Better flexibility for adding new abilities (run, walk, dive, etc.)
5. Cleaner, more maintainable architecture

Remaining PROBLEMS:
1. Still some duplicated flying logic in Crow and Sparrow
2. Behavior reuse is required — inheritance is not ideal for behavior changes
3. If flying style changes (fast fly, slow fly, zigzag fly), code modification required again

Next: Apply **DIP — Dependency Inversion Principle** to fix behavior duplication using composition (Strategy Pattern)
*/

// ============================================
// STEP 6: DIP — Dependency Inversion Principle
// ============================================

/*
DIP Definition:
"High-level modules should not depend on low-level modules. Both should depend on abstractions."
"In other words, classes should depend on interfaces/abstractions, not concrete implementations."

When should you apply DIP?
- When there is a direct dependency on concrete classes
- When you want to change behavior at runtime
- When you need better code reusability
- When you want to use mock objects for testing
- When behavior variations are causing duplication across classes

Our Problem:
Crow and Sparrow share the **same flying behavior**.
In the current design, the flying logic is duplicated in both classes.

Solution:
Use the **Strategy Pattern** to inject the flying behavior via an abstraction.
This removes duplication and allows behavior changes at runtime.
*/

/* 
FINAL IMPROVEMENTS after applying DIP:

1. Crow and Sparrow both use the same StandardFlyBehavior — NO duplication!
Common logic is reused instead of rewriting it in each class.

2. Behaviors can be changed at runtime.
You can switch a bird’s flying behavior dynamically without modifying any class.

3. New behaviors can be added easily (Open/Closed Principle).
You can add new types of fly behaviors without touching existing bird classes.

4. Testing becomes easy — mock behaviors can be injected.
You can pass a mock implementation of FlyBehavior to unit tests.

5. Highly reusable — FlyBehavior can be used anywhere.
Any class can plug in and use the fly behavior; it is not restricted to birds.

6. Loose coupling — Bird_DIP does NOT depend on concrete implementations.
Bird classes depend only on the abstraction (FlyBehavior), not real classes.

7. All SOLID principles are satisfied!
SRP OCP, LSP, ISP, and DIP are correctly applied.
*/

