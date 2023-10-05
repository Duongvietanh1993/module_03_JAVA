package classCircle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        int radius = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào mầu: ");
        String color = sc.nextLine();
        Circle circle = new Circle(radius, color);

        circle.displayObj();
        System.out.println("Chu vi hình chữ nhật: "+ circle.getParameter());
        System.out.println("Diện tích chữ nhật: "+ circle.getArea());
    }
}
