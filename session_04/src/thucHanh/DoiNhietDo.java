package thucHanh;

import java.util.Scanner;

public class DoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Độ F sang độ C");
            System.out.println("2. Độ C sang độ F");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhập vào độ F: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Độ F sang độ C: " + doFquadoC(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Nhập cào độ C: ");
                    celsius = input.nextDouble();
                    System.out.println("Độ C sang độ F: " + doCquadoF(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double doCquadoF(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double doFquadoC(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
