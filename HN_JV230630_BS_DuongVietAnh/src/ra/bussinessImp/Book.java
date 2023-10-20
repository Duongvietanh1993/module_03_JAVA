package ra.bussinessImp;

import ra.bussiness.IBook;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Scanner;

public class Book implements IBook,Comparable<Book>{
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean bookStatus;
    private static int count = 1;

    public Book() {
        this.bookId = count++;
    }

    public Book(String bookName, String title, int numberOfPages, float importPrice, float exportPrice, boolean bookStatus) {
        this.bookId = count++;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = this.exportPrice - this.importPrice;
        this.bookStatus = bookStatus;

    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }


    public float getInterest() {
        return interest;
    }




    public void setBookStatus(Scanner scanner) {
        System.out.println(
                "Trạng thái" + '\n' +
                        "1.true" + '\n' +
                        "2.false" + '\n'
        );
        this.bookStatus = Integer.parseInt(scanner.nextLine()) == 1;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập tên sách (nhập chữ): ");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập tiêu đề sách (nhập chữ): ");
        this.title = scanner.nextLine();
        System.out.println("Nhập số trang sách (nhập số): ");
        this.numberOfPages = Integer.parseInt(scanner.nextLine());
        System.out.println("Giá nhập (nhập số): ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Giá bán (nhập số): ");
        this.exportPrice = Float.parseFloat(scanner.nextLine());
        System.out.println(
                "Trạng thái" + '\n' +
                        "1.true" + '\n' +
                        "2.false" + '\n'
        );
        this.bookStatus = Integer.parseInt(scanner.nextLine()) == 1;

    }

    DecimalFormat formatter = new DecimalFormat("###,###,###");

    @Override
    public void displayData() {
        System.out.println(
                "-------- Book " + bookId + " --------" + '\n' +
                        "bookId: " + bookId + '\n' +
                        "bookName: " + bookName + '\n' +
                        "title: " + title + '\n' +
                        "numberOfPages: " + numberOfPages + '\n' +
                        "importPrice: " + (formatter.format(importPrice)) + " VNĐ" + '\n' +
                        "exportPrice: " + (formatter.format(exportPrice)) + " VNĐ" + '\n' +
                        "interest: " + (formatter.format(interest)) + " VNĐ" + '\n' +
                        "bookStatus: " + bookStatus + '\n'
        );
    }

    @Override
    public int compareTo(Book o) {
        return (int) -(this.interest - getInterest());
    }
}
