package demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhập vào số thứ "+(i+1)+":");
            int a = sc.nextInt();
        }
    }
}
