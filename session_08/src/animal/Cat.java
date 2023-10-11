package animal;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "meo meo";
    }

    @Override
    public String toString() {
        return "Cat{}"+
                "name='" + getName() + '\'' ;
    }
}
