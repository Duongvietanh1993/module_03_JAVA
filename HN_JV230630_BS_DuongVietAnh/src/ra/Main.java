package ra;

import ra.bussinessImp.Book;

import java.util.*;

public class Main {
    static List<Book> listBooks = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        listBooks.add(new Book("Java", "Lập Trình Hướng Đối Tượng", 100, 100000.0f, 150000.0f, true));
        listBooks.add(new Book("JavaScript", "Lập Trình Hướng Thủ Tục", 120, 140000.0f, 180000.0f, true));
        listBooks.add(new Book("HTML", "Siêu Văn Bản", 90, 80000.0f, 100000.0f, true));

        String menu = "*********** MENU CHÍNH ***********" + '\n' +
                "1: Nhập số sách và nhập thông tin sách" + '\n' +
                "2: Hiển thị thông tin các sách" + '\n' +
                "3: Sắp xếp sách theo lợi nhuận giảm dần" + '\n' +
                "4: Xóa sách theo mã sách" + '\n' +
                "5: Tìm kiếm sách theo tên sách" + '\n' +
                "6: Thay đổi trạng thái (false -true) của sách theo mã sách " + '\n' +
                "7: Thoát";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
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
                default:
                    System.out.println("Không có lựa chọn này, mời lựa chọn lại");
                    break;
            }
        } while (choice != 0);
    }

    private static void findBookByName() {
        System.out.println("===== Menu Tìm Kiếm =====");
        System.out.println("Nhập tên sách bạn muốn tìm:");
        String bookName = scanner.nextLine();
        System.out.println("Kết quả tìm kiếm:");
        System.out.println();
        boolean found = false;
        for (Book book : listBooks) {
            if (book.getBookName().toLowerCase().contains(bookName.toLowerCase())) {
                book.displayData();
                found = true;
            }
        }

        if (!found) {
            System.err.println("Không tìm thấy tên sách.");
        }
    }

    private static void changeStatusBook() {
        System.out.println("===== Menu Thay Đổi Trạng Thái =====");
        System.out.println("Nhập ìd sách bạn muốn đổi trạng thái");
        int bookId = Integer.parseInt(scanner.nextLine());
        int index = findIndex(bookId);
        listBooks.get(index).setBookStatus(scanner);
    }


    private static void deleteBook() {
        System.out.println("===== Menu Xóa =====");
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
        System.out.println("====== Menu Sắp Xếp ======");
        Collections.sort(listBooks);
        showAllBook();


    }

    private static void showAllBook() {
        System.out.println("===== Menu Danh Sách =====");
        for (Book book : listBooks) {
            book.displayData();
        }
    }

    private static void addNewBook() {
        System.out.println("====== Menu Thêm Mới ======");
        System.out.println("Nhập số sách muốn thêm (nhập số):");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("----- Nhập thông tin cho sách thứ " + (i + 1) + " -----");
            Book newBook = new Book();
            newBook.inputData(scanner);
            listBooks.add(newBook);
        }
    }
}
