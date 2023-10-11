package geometry;

public class Main {
    public static void main(String[] args) {
// test Shape
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);


        //test Circle
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);

        //test Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle=new Rectangle(1.5,2.5);
        System.out.println(rectangle);

        rectangle=new Rectangle("red",true,1.5,2.5);
        System.out.println(rectangle);
    }
}
