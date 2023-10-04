package phuongThucEquals;

import java.util.Scanner;

public class PhuongThucEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Hello";
        System.out.println("Nhập vào chuỗi muốn kiểm tra ");
        String str1= scanner.nextLine();
        System.out.println("chuỗi nhập có bằng chuỗi gốc: "+comperString(str,str1));
    }

    public static boolean comperString(String str,String str1){
        return str.equals(str1);
    }
}
