package demo;

public class Demo {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Độ dài chuỗi: " + s.length());
        System.out.println("Kí tự ở vị trí thứ 3: " + s.charAt(2));
        String conCatString = s.concat(" lớp JAVA");
        System.out.println("Nối chuỗi: " + conCatString);
        String upperCase = s.toUpperCase();
        System.out.println("Viết hoa: " + upperCase);
        String lowerCase = s.toLowerCase();
        System.out.println("Viết thường: " + lowerCase);

        String s1 = "java";
        String s2 = "JAVA";

        System.out.println("so sánh chuỗi s1 va s2: " + s1.compareTo(s2));
        System.out.println("so sánh chuỗi s1 va s2 k phân biệt hoa thường: " + s1.compareToIgnoreCase(s2));

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("kiểm tra kết quả s có kết thúc bằng s1: " + s.endsWith(s1));
        /*kiểm tra có thuộc không*/
        System.out.println("kiểm tra s có chứa s1 không: " + s.contains(s1));


    }
}
