package classRectangle;

import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public int getArea() {
        return this.width * this.height;
    }

    public void displayData() {
        System.out.println("Hình chữ nhật{ dài: " + height + ", rộng: " + width);
    }
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài: ");
        this.height=scanner.nextInt();
        System.out.println("Nhập vào chiều rộng: ");
        this.width=scanner.nextInt();
    }
}
