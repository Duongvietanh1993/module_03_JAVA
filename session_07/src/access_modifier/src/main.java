package access_modifier.src;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Diện tích hình tròn là: "+circle.getArea());
    }
}
