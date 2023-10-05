package classCircle;

import java.util.Scanner;

public class Circle {
    int radius;
    String color;

    public Circle() {
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getParameter() {
        return 2 * this.radius * Math.PI;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public void displayObj() {
        System.out.println("Hình Tròn{ " + "bán kính: " + this.radius + " Mầu: " + this.color + " }");
    }

    public  void  inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        this.radius = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào mầu: ");
        this.color = sc.nextLine();
    }
}
