import java.util.Scanner;

public class Menu {
    static Book[] ListBook = new Book[100];
    static int currentIndex = 0;
    static Scanner scanner = new Scanner(System.in);


    public void showMainMenu() {
        Book newBook = ListBook[currentIndex];
        ListBook[currentIndex++] = new Book("math", "Văn T", "Học toán tốt", 50000, 80000, 10, true);
        ListBook[currentIndex++] = new Book("physical", "Văn L", "học lý tốt", 35000, 75000, 10, true);
        ListBook[currentIndex++] = new Book("chemistry", "Văn h", "học hóa tôt", 30000, 95000, 10, true);

        String menu = "========= Menu ==========\n" +
                "1.Thêm mới\n" +
                "2.Hiển thị thông tin tất cả sách trong thu viện\n" +
                "3.Sắp xếp (theo lợi nhận tăng dần)\n" +
                "4.Xóa (theo mã sách)\n" +
                "5.Tìm kiếm (theo mã sách)\n" +
                "6.Thay đổi thông tin sách (theo mã sách)\n" +
                "0.Thoát khỏi chương trình\n";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayAll();
                    break;
                case 3:
                    sortInterest();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    findBook();
                    break;
                case 6:
                    editBook();
                    break;
                default:
                    System.out.println("Mời nhập lại");
            }
        } while (choice != 0);
    }

    public static void displayAll() {
        System.out.println("---- Hiển Thị Toàn Bộ ----");
        for (int i = 0; i < currentIndex; i++) {
            ListBook[i].displayData();
        }
        System.out.println("---------------------------");
    }

    public static void addBook() {
        System.out.println("---- Thêm Mới ----");
        Book book = new Book();
        book.inputData();
        ListBook[currentIndex++] = book;

    }

    public static int findIndexById(int id) {
        for (int i = 0; i < currentIndex; i++) {
            if (ListBook[i].getBookId() == id) {
                return i;
            }
        }
        return -1;
    }


    public static void editBook() {
        System.out.println("---- Sửa Đổi Thông Tin ----");
        System.out.println("Nhập vào Id muốn sửa: ");
        int id = scanner.nextInt();
        int editId = findIndexById(id);
        if (editId != -1) {
            Book book = ListBook[editId];
            System.out.println("----Cập nhật thông tin sách----");
            book.inputData();
            ListBook[editId] = book;
            System.out.println("Sách đã được cập nhật thành công.");
        } else {
            System.err.println("Không tìm thấy sách có Id=" + id);
        }
    }

    public static void deleteBook() {
        System.out.println("Nhập vào Id muốn xóa: ");
        int id = scanner.nextInt();
        int editId = findIndexById(id);
        if (editId != -1) {
            Book deletedStudent = ListBook[editId];
            for (int i = editId; i < currentIndex - 1; i++) {
                ListBook[i] = ListBook[i + 1];
            }
            currentIndex--;
            System.out.println("--- Đã Xóa Học Sinh ---\n");
            deletedStudent.displayData();
        } else {
            System.err.println("Không tìm thấy sách có Id=" + id);
        }
    }

    public static void findBook() {
        System.out.println("---- Tìm Kiếm ----");
        System.out.println("Nhập vào tên muốn tìm");
        scanner.nextLine();

        String bookName = scanner.nextLine().trim().toLowerCase();
        boolean check = false;
        System.out.println("---- Kết quả tìm kiếm ----");
        for (int i = 0; i < currentIndex; i++) {
            Book listBook = ListBook[i];
            if (listBook.getBookName().contains(bookName)) {
                listBook.displayData();
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sách có tên: " + bookName);
        }
    }

    public static void sortInterest() {
        System.out.println("---- Sắp xếp theo lợi nhuận ----");
        for (int i = 0; i < currentIndex - 1; i++) {
            for (int j = i + 1; j < currentIndex; j++) {
                if (ListBook[j].getInterest() < ListBook[i].getInterest()) {
                    // Hoán đổi vị trí của hai sách
                    Book temp = ListBook[i];
                    ListBook[i] = ListBook[j];
                    ListBook[j] = temp;
                }
            }
        }
        for (int i = 0; i < currentIndex; i++) {
            ListBook[i].displayData();
        }
    }
}

