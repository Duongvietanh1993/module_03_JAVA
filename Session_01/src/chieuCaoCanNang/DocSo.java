package chieuCaoCanNang;

import java.util.Scanner;

public class DocSo {
    // Mảng chứa từ tiếng Anh tương ứng với các số từ 1 đến 19
    private static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    // Mảng chứa từ tiếng Anh tương ứng với các số hàng chục từ 20 đến 90
    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao");
        int height = sc.nextInt();
        System.out.println("Nhập vào cân nặng");
        int weight = sc.nextInt();

        String numberWeight = convertNumberToWords(weight);
        String numberHeight = convertNumberToWords(height);

        System.out.println("Height in words: " + numberHeight);
        System.out.println("Weight in words: " + numberWeight);
    }

    // Phương thức chuyển đổi số thành từ tiếng Anh
    public static String convertNumberToWords(int number) {
        // Kiểm tra số có trong khoảng từ 1 đến 19
        if (number >= 1 && number <= 19) {
            return units[number];
        }
        // Kiểm tra số có trong khoảng từ 20 đến 99
        else if (number >= 20 && number <= 99) {
            int tensDigit = number / 10;       // Chữ số hàng chục
            int unitsDigit = number % 10;      // Chữ số hàng đơn vị

            return tens[tensDigit] + " " + units[unitsDigit];
        }
        // Kiểm tra số có trong khoảng từ 100 đến 999
        else if (number >= 100 && number <= 999) {
            int hundredsDigit = number / 100;  // Chữ số hàng trăm
            int remainingNumber = number % 100; // Số còn lại sau khi lấy chữ số hàng trăm

            return units[hundredsDigit] + " hundred " + convertNumberToWords(remainingNumber);
        }

        return "Invalid number"; // Trả về thông báo khi số không hợp lệ
    }
}