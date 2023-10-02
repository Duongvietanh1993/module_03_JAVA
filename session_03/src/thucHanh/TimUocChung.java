package thucHanh;

import java.util.Scanner;

public class TimUocChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhập số a: ");
        a = sc.nextInt();
        System.out.println("Nhập số b: ");
        b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("Không có ước chung lớn nhất");
        }
        while (a != b){
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Ước số chung lớn nhất: " + a);
    }
}
