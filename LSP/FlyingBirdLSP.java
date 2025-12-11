package solidprinciples.LSP;

public class FlyingBirdLSP extends BirdLSP implements CanFlyLSP{

    public FlyingBirdLSP(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeSound'");
    }
}
