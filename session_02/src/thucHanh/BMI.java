package thucHanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double CN, CC, CS;
        System.out.println("Nhập vào cân nặng (kg):");
        CN = scanner.nextDouble();
        System.out.println("Nhập vào chiều cao (m):");
        CC = scanner.nextDouble();
        CS = Math.round(CN / Math.pow(CC, 2));
        if (CS < 18.5) {
            System.out.println("Chỉ số của bạn là: " + CS);
            System.out.println(" Bạn quá gầy");
        } else if (CS < 25.0 && CS >= 18.5) {
            System.out.println("Chỉ số của bạn là: " + CS);
            System.out.println(" Cơ thể bạn bình thường");
        } else if (CS < 30.0 && CS >= 25.0) {
            System.out.println("Chỉ số của bạn là: " + CS);
            System.out.println(" Bạn hơi béo");
        } else {
            System.out.println("Chỉ số của bạn là: " + CS);
            System.out.println(" Bạn quá béo");
        }
    }
}
