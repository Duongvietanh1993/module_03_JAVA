package user;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User student = new Student("viet", "123456", 1, "toan");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào userName: ");
        String userName = scanner.nextLine();
        System.out.println("Nhập vào password: ");
        String password = scanner.nextLine();
        if (student.login(userName, password)) {
            student.displaUser();
        }

    }

}
