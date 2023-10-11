package triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh 1: ");
        double side1 = sc.nextDouble();

        System.out.println("Nhập độ dài cạnh 2: ");
        double side2 = sc.nextDouble();

        System.out.println("Nhập độ dài cạnh 3: ");
        double side3 = sc.nextDouble();

        while (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("Đây không phải tam giác");
            System.out.println("Nhập độ dài cạnh 1: ");
            side1 = sc.nextDouble();

            System.out.println("Nhập độ dài cạnh 2: ");
            side2 = sc.nextDouble();

            System.out.println("Nhập độ dài cạnh 3: ");
            side3 = sc.nextDouble();
        }

        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println("Nhập màu sắc: ");
        sc.nextLine();
        String color = sc.nextLine();
        triangle.setColor(color);
        System.out.printf("Tam giác có màu sắc = '%s', diện tích = '%f', chu vi = '%f'", triangle.getColor(), triangle.getArea(), triangle.getPerimeter());
    }
}
