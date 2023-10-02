package ungDungChuViDienTich;

import java.util.Scanner;

public class ChuViDienTich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("====== Menu =====");
            System.out.println("1.Tính chu vi diện tích hình chữ nhật");
            System.out.println("2.Tính chu vi diện tích hình tam giác");
            System.out.println("3.Tính chu vi diện tích hình tròn");
            System.out.println("Thoát");
            System.out.print("Mời bạn nhập lựa chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("==== Tình hình chữ nhật ====");
                    System.out.println("Nhập chiều dài");
                    int height = sc.nextInt();
                    System.out.println("Nhập chiều rộng");
                    int width = sc.nextInt();
                    int perimeter = 2 * (height * width);
                    int area = height * width;
                    System.out.println("chu vi: "+perimeter+" diện tích: "+area);
                    break;
                case 2:
                    System.out.println("==== Tình hình tam giác ====");
                    System.out.println("Nhập chiều cạnh a");
                    double a = sc.nextDouble();
                    System.out.println("Nhập chiều cạnh b");
                    double b = sc.nextDouble();
                    System.out.println("Nhập chiều cạnh c");
                    double c = sc.nextDouble();
                    double perimeterT = a+b+c;
                    double p = perimeterT/2;
                    double areaT = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                    System.out.println("chu vi: "+perimeterT+" diện tích: "+areaT);
                    break;
                case 3:
                    System.out.println("==== Tình hình tròn ====");
                    System.out.println("Nhập bán kính");
                    double r = sc.nextDouble();
                    double perimeterTr= 2*Math.PI*r;
                    double areaTr=Math.PI*(Math.pow(r,2));
                    System.out.println("chu vi: "+perimeterTr+" diện tích: "+areaTr);
                    break;
            }
        }
    }
}
