package classQuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Khởi tạo biến a,b,c
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = input.nextDouble();
        System.out.println("Nhập b: ");
        double b= input.nextDouble();
        System.out.println("Nhập c: ");
        double c =input.nextDouble();

        QuadraticEquation phuongTrinh = new QuadraticEquation(a,b,c);
        System.out.println(phuongTrinh.getRoot1());
        System.out.println(phuongTrinh.getRoot2());
    }
}
