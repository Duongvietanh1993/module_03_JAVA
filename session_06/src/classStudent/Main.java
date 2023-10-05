package classStudent;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student(1,"Nguyễn Văn A",true,"JV2630",20,"HN");
        Student stu2 = new Student(1,"Nguyễn Văn B",true,"JV2630",20,"HN");
        Student stu3 = new Student(1,"Nguyễn Văn C",true,"JV2630",20,"HN");

        System.out.println("========Thông tin học sinh 1========");
        System.out.println(stu1);
        System.out.println("========Thông tin học sinh 2========");
        System.out.println(stu2);
    }
}
