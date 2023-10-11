package circleCylinder;

public class Main {
    public static void main(String[] args) {

        //test Circle
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(3,"red");
        System.out.println(circle1);
        System.out.println(circle1.getArea());

        //test cylinder
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        Cylinder cylinder1 = new Cylinder(5,"blue",8);
        System.out.println(cylinder1);
        System.out.println(cylinder1.getVolumetric());

    }
}
