package config;

import java.util.Scanner;

public class Config {
    public static Scanner scanner (){
        return new Scanner(System.in);
    }

    public static int validate (){
        int n;
        System.out.println("Mời Nhập: ");
        while (true){
            try {
                n=Integer.parseInt(scanner().nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Sai định dạng, mời nhập lại: ");
            }
        }
        return n;
    }
}
