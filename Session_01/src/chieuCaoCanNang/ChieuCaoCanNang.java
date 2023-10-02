package chieuCaoCanNang;

import java.util.Scanner;

public class ChieuCaoCanNang {
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

    public static String convertNumberToWords(int number) {
        if (number >= 1 && number <= 9) {
            return getWordForDigit(number);
        } else if (number >= 10 && number <= 19) {
            return getWordForTeen(number);
        } else if (number >= 20 && number <= 99) {
            int tens = number / 10;
            int units = number % 10;

            String tensWord = getWordForTens(tens);
            String unitsWord = getWordForDigit(units);

            return tensWord + " " + unitsWord;
        } else if (number >= 100 && number <= 999) {
            int hundreds = number / 100;
            int remaining = number % 100;

            String hundredsWord = getWordForDigit(hundreds);
            String remainingWords = convertNumberToWords(remaining);

            return hundredsWord + " hundred " + remainingWords;
        }

        return "Invalid number";
    }

    public static String getWordForDigit(int digit) {
        switch (digit) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String getWordForTeen(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }

    public static String getWordForTens(int tens) {
        switch (tens) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }
}