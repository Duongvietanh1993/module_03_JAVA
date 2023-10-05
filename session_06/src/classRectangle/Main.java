package classRectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.inputData();
        rectangle.displayData();
        System.out.println("Chu vi: "+rectangle.getPerimeter());
        System.out.println("Diện tích: "+rectangle.getArea());
    }
}
