package animal;

public class Dog extends Animal{
    private String color;

    public Dog() {
    }

    public Dog(String color) {
        this.color = color;
    }

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "gau gau";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                "color='" + color + '\'' +
                '}';
    }
}
