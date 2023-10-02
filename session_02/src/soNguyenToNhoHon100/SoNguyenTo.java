package soNguyenToNhoHon100;

public class SoNguyenTo {
    public static void main(String[] args) {
        int countSNT = 100;
        int n = 2;
        while (n <= countSNT) {
            int i = 2;
            boolean check = true;
            while (i < n) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(n);
            }
            n++;
        }
    }
}
