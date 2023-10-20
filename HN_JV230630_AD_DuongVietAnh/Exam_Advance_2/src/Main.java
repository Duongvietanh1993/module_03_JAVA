import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "";

        String menu = "****** Menu chính ******\n" +
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
                    System.out.println("---- Menu Nhập Câu ----");
                    System.out.print("Nhập câu: ");
                    sentence = scanner.nextLine();
                    break;
                case 2:
                    System.out.println("---- Menu Đảo Câu ----");
                    String reversedSentence = reverseSentence(sentence);
                    System.out.println("Câu đảo ngược: " + reversedSentence);
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }

            System.out.println();
        } while (choice != 0);
    }

    private static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        int left = 0;
        int right = words.length - 1;

        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            reversedSentence.append(word).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}