import java.text.DecimalFormat;
import java.util.Scanner;

public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private String description;
    private double importPrice;
    private double exportPrice;
    double interest;
    private int quantity;
    private boolean bookStatus;

    static int count = 1;

    public Book() {
        this.bookId = count++;

    }

    public Book(String bookName, String author, String description, double importPrice, double exportPrice, int quantity, boolean bookStatus) {
        this.bookId = count++;
        this.bookName = bookName;
        this.author = author;
        this.description = description;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = this.exportPrice - this.importPrice;
        this.quantity = quantity;
        this.bookStatus = true;
    }

    public double getInterest() {
        return this.exportPrice - this.importPrice;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sách: ");
        this.bookName = scanner.nextLine();

        // Kiểm tra tên sách không để trống
        while (this.bookName.isEmpty()) {
            System.err.println("Tên sách không được để trống. Vui lòng nhập lại: ");
            this.bookName = scanner.nextLine();
        }

        System.out.println("Nhập tác giả: ");
        this.author = scanner.nextLine();

        // Kiểm tra tác giả không để trống
        while (this.author.isEmpty()) {
            System.err.println("Tác giả không được để trống. Vui lòng nhập lại: ");
            this.author = scanner.nextLine();
        }

        System.out.println("Nhập mô tả: ");
        this.description = scanner.nextLine();

        // Kiểm tra mô tả không để trống và ít nhất 10 ký tự
        while (this.description.isEmpty() || this.description.length() < 10) {
            System.err.println("Mô tả không được để trống và phải có ít nhất 10 ký tự. Vui lòng nhập lại: ");
            this.description = scanner.nextLine();
        }

        System.out.println("Giá Nhập: ");
        this.importPrice = Double.parseDouble(scanner.nextLine());

        // Kiểm tra giá nhập lớn hơn 0
        while (this.importPrice <= 0) {
            System.err.println("Giá nhập phải lớn hơn 0. Vui lòng nhập lại: ");
            this.importPrice = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Giá xuất: ");
        this.exportPrice = Double.parseDouble(scanner.nextLine());

        // Kiểm tra giá xuất lớn hơn 1.2 lần giá nhập
        while (this.exportPrice <= 1.2 * this.importPrice) {
            System.err.println("Giá xuất phải lớn hơn 1.2 lần giá nhập. Vui lòng nhập lại: ");
            this.exportPrice = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Số lượng sản phẩm: ");
        this.quantity = Integer.parseInt(scanner.nextLine());

        // Kiểm tra số lượng sản phẩm lớn hơn 0
        while (this.quantity <= 0) {
            System.err.println("Số lượng sản phẩm phải lớn hơn 0. Vui lòng nhập lại: ");
            this.quantity = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Trạng thái: ");
        this.bookStatus = Boolean.parseBoolean(scanner.nextLine());

        this.interest = this.exportPrice - this.importPrice;
    }



    DecimalFormat formatter = new DecimalFormat("###,###,###");


    public void displayData() {
        System.out.println(
                "bookId: " + bookId + '\n' +
                "bookName: " + bookName + '\n' +
                "author: " + author + '\n' +
                "description: " + description + '\n' +
                "importPrice: " + (formatter.format(importPrice)) + " VNĐ" + '\n' +
                "exportPrice: " + (formatter.format(exportPrice)) + " VNĐ" + '\n' +
                "interest: " + (formatter.format(interest)) + " VNĐ" + '\n' +
                "quantity: " + quantity + '\n' +
                "bookStatus: " + bookStatus + '\n'
        );
    }
}
