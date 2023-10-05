package classExam_Basic;

import StudentMenu.Student;

import java.util.Scanner;

public class Main {
    static Library[] libraryListBook = new Library[100];
    static int currentIndex = 0;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Library book1 = new Library("book1", "a", "ádasdadadasdadad", 10000, 15000, 10, true);
        Library book2 = new Library("book2", "a", "ádasdadadasdadad", 20000, 40000, 10, true);
        Library book3 = new Library("book3", "a", "ádasdadadasdadad", 5000, 12000, 10, true);
        Library book4 = new Library("book4", "a", "ádasdadadasdadad", 1000, 4000, 10, true);
        libraryListBook[currentIndex] = book1;
        currentIndex++;
        libraryListBook[currentIndex] = book2;
        currentIndex++;
        libraryListBook[currentIndex] = book3;
        currentIndex++;
        libraryListBook[currentIndex] = book4;
        currentIndex++;


        int choice = 0;
        do {
            System.out.println("====== Menu ======");
            System.out.println("1.Thêm");
            System.out.println("2.Hiển thị tất cả");
            System.out.println("3.Sửa");
            System.out.println("4.Xóa");
            System.out.println("5.Sắp xếp theo lợi nhận");
            System.out.println("6.Tìm kiếm");
            System.out.println("0.Thoát");
            System.out.println("Mời nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayAll();
                    break;
                case 3:
                    editBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    sortInterest();
                    break;
                case 6:
                    findBook();
                    break;
                default:
                    System.out.println("Mời nhập lại");
            }
        } while (choice != 0);

    }

    public static void displayAll() {
        System.out.println("----Toàn bộ sách----");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(libraryListBook[i]);
        }
        System.out.println("--------------------");
    }

    public static void addBook() {
        Library book = new Library();
        book.inputData();
        libraryListBook[currentIndex++] = book;

    }

    public static int findIndexById(int id) {
        for (int i = 0; i < currentIndex; i++) {
            if (libraryListBook[i].getBookId() == id) {
                return i;
            }
        }
        return -1;
    }


    public static void editBook() {
        System.out.println("Nhập vào Id muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int editId = findIndexById(id);
        if (editId != -1) {
            Library book = libraryListBook[editId];
            System.out.println("----Cập nhật thông tin sách----");
            book.inputData();
            libraryListBook[editId] = book;
            System.out.println("Sách đã được cập nhật thành công.");
        } else {
            System.err.println("Không tìm thấy sách có Id=" + id);
        }
    }

    public static void deleteBook() {
        System.out.println("Nhập vào Id muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int editId = findIndexById(id);
        if (editId != -1) {
            Library deletedStudent = libraryListBook[editId];
            // Di chuyển các phần tử sau về trước để xóa học sinh
            for (int i = editId; i < currentIndex - 1; i++) {
                libraryListBook[i] = libraryListBook[i + 1];
            }
            currentIndex--;
            System.out.println("Đã xóa học sinh: " + deletedStudent);
        } else {
            System.err.println("Không tìm thấy sách có Id=" + id);
        }
    }

    public static void findBook() {
        System.out.println("Nhập vào tên muốn tìm");
        String bookName = scanner.nextLine().trim().toLowerCase();
        boolean check = false;
        System.out.println("----Kết quả tìm kiếm----");
        for (int i = 0; i < currentIndex; i++) {
            Library listBook = libraryListBook[i];
            if (listBook.getBookName().contains(bookName)) {
                System.out.println(listBook);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sách có tên: " + bookName);
        }
    }

    public static void sortInterest() {
        System.out.println("----Sắp xếp theo lợi nhuận----");
        for (int i = 0; i < currentIndex - 1; i++) {
            for (int j = i + 1; j < currentIndex; j++) {
                if (libraryListBook[j].getInterest() < libraryListBook[i].getInterest()) {
                    // Hoán đổi vị trí của hai sách
                    Library temp = libraryListBook[i];
                    libraryListBook[i] = libraryListBook[j];
                    libraryListBook[j] = temp;
                }
            }
        }
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(libraryListBook[i]);
        }
    }
}
