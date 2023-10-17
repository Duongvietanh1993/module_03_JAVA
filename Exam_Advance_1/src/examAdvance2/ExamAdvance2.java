package examAdvance2;

import java.util.Scanner;
import java.util.Stack;

public class ExamAdvance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "";


        String menu = "=========Menu chính==========\n" +
                "1. Nhập câu\n" +
                "2. Đảo ngược câu\n" +
                "0. Thoát\n";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập câu: ");
                    sentence = scanner.nextLine();
                    break;
                case 2:
                    String reversedSentence = reverseSentence(sentence);
                    System.out.println("Câu đảo ngược: " + reversedSentence);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }

            System.out.println();
        } while (choice != 0);
    }

    private static String reverseSentence(String sentence) {
        Stack<String> stack = new Stack<>();
        String[] words = sentence.split(" ");

        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reversedSentence = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedSentence.append(stack.pop()).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}
