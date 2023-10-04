package demo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validateMail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập email cần so sánh: ");
        do {
            String email = scanner.nextLine();
            String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
            System.out.println("Kiểm tra email : " + Pattern.matches(regex, email));
            if (Pattern.matches(regex, email)) {
                System.out.println("Email của bạn là: "+email);
                break;
            } else {
                System.err.println("Email không đúng định dạng, mời nhập lại: ");
            }
        }while (true);
    }
}
