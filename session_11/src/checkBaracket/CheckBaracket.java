package checkBaracket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBaracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi đầu vào: ");
        String input = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    System.out.println("không có cặp ngoặc");
                    return;
                }
                char openBracket = stack.pop();  // tạo biến openBracket để lấy ngoặc mở cuối cùng khỏi stack
                if (!isMatchingBracket(openBracket, ch)) {  // gọi hàm check với biến openBracket, và ngoặc đóng hiện tại.
                    System.out.println("không có cặp ngoặc");  // nếu biến trả về false có nghĩa là cặp ngoặc đóng mở không tương đồng
                    return;
                }
            }
        }
        boolean check = stack.isEmpty();
        if (check) {
            System.out.println("có các cặp ngoặc hợp lệ");
        } else System.out.println("không có cặp ngoặc");
    }

    private static boolean isMatchingBracket(char open, char close) {  // hàm kiểm tra cặp ngoặc trùng khớp
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}



