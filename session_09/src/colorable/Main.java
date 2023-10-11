package colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(3, 4);
        shapes[1] = new Square(2);

        for(Shape s : shapes){
            if(s instanceof Rectangle) {
                System.out.println(((Rectangle) s).getArea());
            }

            if(s instanceof Square) {
                System.out.println(((Square) s).getArea());
            }
            if(s instanceof Colorable) {
                ((Colorable) s).howToColor();
            }
        }
    }
}
