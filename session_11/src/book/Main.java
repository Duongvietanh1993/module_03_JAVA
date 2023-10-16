package book;

import book.model.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Book> listBooks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println(
                    " ****************JAVA-HACKATHON-05-BASIC-MENU***************" + '\n' +
                            "1: Nhập số sách (n) cần nhập thông tin từ bàn phím và thực hiện nhập thông tin cho n sách đó" + '\n' +
                            "2: Hiển thiện thông tin sách cho tất cả sách đang lưu trữ" + '\n' +
                            "3: Sử dụng Comparable để cài đặt sắp xếp giảm dần cho các sách đang lưu trữ" + '\n' +
                            "4: Nhập mã sách cần xóa từ bàn phím, thực hiện xóa sách trong danh sách" + '\n' +
                            "5: Nhập tên sách từ bàn phím, thực hiện tìm và in ra sách có tên phù hợp" + '\n' +
                            "6: Nhập vào mã sách, thay đổi trạng thái sách (false -true)" + '\n' +
                            "7: Thoát khỏi chương trình"
            );
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewBook();
                    break;
                case 2:
                    showAllBook();
                    break;
                case 3:
                    sortBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    findBookByName();
                    break;
                case 6:
                    changeStatusBook();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        }
    }

    private static void findBookByName() {
        System.out.println("Nhập tên sách bạn muốn tìm");
        String bookName = scanner.nextLine();
        System.out.println("Kết quả tìm kiếm:");
        System.out.println();
        for (Book book : listBooks) {
            if (book.getBookName().toLowerCase().contains(bookName.toLowerCase())) {
                book.displayData();
            }
        }
        System.out.println();
    }

    private static void changeStatusBook() {
        System.out.println("Nhập ìd sách bạn muốn đổi trạng thái");
        int bookId = Integer.parseInt(scanner.nextLine());
        int index = findIndex(bookId);
        listBooks.get(index).setBookStatus(scanner);
    }


    private static void deleteBook() {
        System.out.println("Nhập ìd sách bạn muốn xóa");
        int deleteId = Integer.parseInt(scanner.nextLine());
        int index = findIndex(deleteId);
        listBooks.remove(index);
    }

    private static int findIndex(int id) {
        for (int i = 0; i < listBooks.size(); i++) {
            if (listBooks.get(i).getBookId() == id) {
                return i;
            }
        }
        return -1;
    }

    private static void sortBook() {
        Collections.sort(listBooks, (book1, book2) -> Float.compare(book2.getInterest(), book1.getInterest()));
        System.out.println("Đã sắp xếp theo lợi nhuận!");
    }

    private static void showAllBook() {
        for (Book book : listBooks) {
            book.displayData();
            System.out.println();
        }
    }

    private static void addNewBook() {
        System.out.println("Nhập số sách muốn thêm");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Book newBook = new Book();
            newBook.inputData(scanner);
            listBooks.add(newBook);
        }
    }
}
