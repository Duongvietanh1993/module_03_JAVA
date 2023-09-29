package ChuVi;

import java.util.Scanner;

public class ChuVi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều rộng");
        int dai = sc.nextInt();
        System.out.println("Nhập vào chiều dài");
        int rong  = sc.nextInt();
        int perimeter = (dai+rong)*2;
        int area = dai*rong;
        System.out.println("Chu vi là: "+ perimeter+" Diện tích là: "+ area);
    }
}
