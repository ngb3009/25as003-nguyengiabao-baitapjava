package ex46;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public String toString() {
        return "Mamal[" + super.toString() + "]";
    }
}