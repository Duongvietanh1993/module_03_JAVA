package model;

import java.util.Scanner;

public class Singer {
    private static int count = 1;
    private int singerId;
    private static String singerName;
    private int age;
    private String nationality;
    private boolean gender;
    private String genre;

    public Singer() {
        this.singerId = count++;
    }

    public Singer(String singerName, int age, String nationality, boolean gender, String genre) {
        this.singerId = count++;
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }

    public int getSingerId() {
        return singerId;
    }

    public static String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên ca sĩ: ");
        singerName = scanner.nextLine();
        // Kiểm tra tên không để trống
        while (this.singerName.isEmpty()) {
            System.err.println("Tên ca sĩ không được để trống. Vui lòng nhập lại: ");
            this.singerName = scanner.nextLine();
        }

        System.out.println("Tuổi: ");
        age = Integer.parseInt(scanner.nextLine());
        // Kiểm tra tuổi lớn hơn 0
        while (this.age < 0) {
            System.err.println("Tuổi phải lớn hơn 0. Vui lòng nhập lại: ");
            this.age = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Quốc Tịch: ");
        nationality = scanner.nextLine();
        // Kiểm tra quốc tịch không để trống
        while (this.nationality.isEmpty()) {
            System.err.println("Quốc tịch không được để trống. Vui lòng nhập lại: ");
            this.nationality = scanner.nextLine();
        }

        System.out.println("Giới tính (true cho nam, false cho nữ): ");
        gender = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Thể Loại: ");
        genre = scanner.nextLine();
        // Kiểm tra quốc tịch không để trống
        while (this.genre.isEmpty()) {
            System.err.println("Thể loại không được để trống. Vui lòng nhập lại: ");
            this.genre = scanner.nextLine();
        }
    }

    public void displayData() {
        System.out.println(
                "singerId: " + singerId + '\n' +
                        "singerName: " + singerName + '\n' +
                        "age: " + age + '\n' +
                        "nationality: " + nationality + '\n' +
                        "gender: " + (gender ? "Nam" : "Nữ") + '\n' +
                        "genre: " + genre + '\n'
        );
    }
}
