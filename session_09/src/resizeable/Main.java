package resizeable;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1.2);
        circles[1] = new Circle(5);
        circles[2] = new Circle(2);

        System.out.println("Diện tích trước tăng");

        for(Circle c : circles){
            System.out.println(c.getArea());
        }

        for(Circle c : circles){
            double random = Math.random() * 99 + 1;
            c.resize(random);
        }

        System.out.println("Diện tích sau tăng");

        for(Circle c : circles){
            System.out.println(c.getArea());
        }
    }
}
