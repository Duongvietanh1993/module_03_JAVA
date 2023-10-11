package animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog("lu","red");
        Cat cat = new Cat("miu");
        System.out.println(dog);
        System.out.println(dog.makeSound());
        System.out.println(cat);
        System.out.println(cat.makeSound());
    }


}
