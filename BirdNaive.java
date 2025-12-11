package solidprinciples;

public class BirdNaive {

    private String type;

    public BirdNaive(String type) {
        this.type = type;
    }

    public void fly(){
        if (type.equals("Penguin")) {
            System.out.println("Penguin cannot fly!");
        } else if (type.equals("Ostrich")) {
            System.out.println("Ostrich cannot fly!");
        } else if (type.equals("Crow") || type.equals("Sparrow")) {
            System.out.println(type + " is flying with standard wing flapping");
        } else if (type.equals("Pigeon")) {
            System.out.println(type + " is flying");
        }
    }

    public void eat(){
        System.out.println(type+" is eating");
    }

    public void makeSound(){
        if (type.equals("Pigeon")) {
            System.out.println("Pigeon: Coo coo!");
        } else if (type.equals("Crow")) {
            System.out.println("Crow: Caw caw!");
        } else if (type.equals("Sparrow")) {
            System.out.println("Sparrow: Chirp chirp!");
        } else if (type.equals("Penguin")) {
            System.out.println("Penguin: Honk honk!");
        } else if (type.equals("Ostrich")) {
            System.out.println("Ostrich: Boom boom!");
        }
    }
}
