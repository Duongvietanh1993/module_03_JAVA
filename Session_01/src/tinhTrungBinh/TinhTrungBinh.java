package tinhTrungBinh;

import java.util.Scanner;

public class TinhTrungBinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm toán");
        double toan = sc.nextDouble();
        System.out.println("Nhập điểm lý");
        double ly = sc.nextDouble();
        System.out.println("Nhập điểm hóa");
        double hoa = sc.nextDouble();
        System.out.println("Nhập điểm văn");
        double van = sc.nextDouble();
        System.out.println("Nhập điểm anh");
        double anh = sc.nextDouble();

        double tb = (toan+ly+hoa+van+anh)/5;

        if (tb >=9){
            System.out.println("Điểm "+tb+" xếp loại xuất sắc");
        }else if (tb >=8){
            System.out.println("Điểm "+tb+" xếp loại giỏi");
        }else if (tb >=6.5){
            System.out.println("Điểm "+tb+" xếp loại khá");
        }else if (tb >=5){
            System.out.println("Điểm "+tb+" xếp loại trung bình");
        }else {
            System.out.println("Điểm "+tb+" xếp loại yếu");
        }
    }
}
