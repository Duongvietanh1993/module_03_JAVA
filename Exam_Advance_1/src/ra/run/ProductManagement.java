package ra.run;

import ra.bussinessImp.Catalog;
import ra.bussinessImp.Product;

import java.util.*;

public class ProductManagement {
    static Scanner scanner = new Scanner(System.in);
    static List<Catalog> catalogList = new ArrayList<>();
    static List<Product> productsList = new ArrayList<>();

    public void showMain(String[] args) {
        catalogList.add(new Catalog("Iphone", 1, "Điện thoại", true));
        catalogList.add(new Catalog("Ipad", 2, "Máy tính bảng", true));
        catalogList.add(new Catalog("MacBook", 1, "Máy tính xách tay", true));

        String menu = "=========Menu chính==========\n" +
                "1.Nhập số danh mục sản phẩm và nhập thông tin các danh mục\n" +
                "2.Nhập số sản phẩm và nhập thông tin các sản phẩm\n" +
                "3.Sắp xếp sản phẩm theo giá sản phẩm tăng dần\n" +
                "4.Tìm kiếm sản phẩm theo tên danh mục sản phẩm \n" +
                "0.Thoát khỏi chương trình\n";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    inputCatalogs();
                    break;
                case 2:
                    inputProducts();
                    break;
                case 3:
                    sortProductsByPrice();
                    break;
                case 4:
                    searchProductByCatalog();
                    break;
                default:
                    System.err.println("Không có lựa chọn này, mời lựa chọn lại");
            }
        } while (choice != 0);
    }

    private static void inputCatalogs() {
        System.out.println("Nhập số danh mục sản phẩm: ");
        int numCatalogs = scanner.nextInt();
        for (int i = 0; i < numCatalogs; i++) {
            Catalog catalog = new Catalog();
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ": ");
            catalog.inputData();
            catalogList.add(catalog);
        }
    }

    private static void inputProducts() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số sản phẩm: ");
        int numProducts = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numProducts; i++) {
            Product product = new Product();
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            product.inputData();

            System.out.println("Danh sách danh mục sản phẩm:");
            displayCatalogs();
            System.out.print("Chọn mã danh mục sản phẩm cho sản phẩm: ");
            int catalogId = Integer.parseInt(scanner.nextLine());
            Catalog selectedCatalog = findCatalogById(catalogId);
            if (selectedCatalog != null) {
                product.setCatalog(selectedCatalog);
                productsList.add(product);
                System.out.println("Sản phẩm đã được thêm vào danh sách.");
            } else {
                System.err.println("Không tìm thấy danh mục sản phẩm với mã " + catalogId);
                System.err.println("Mời nhập bổ sung thêm danh mục");
            }
        }
    }

    private static void displayCatalogs() {
        for (Catalog catalog : catalogList) {
            catalog.displayData();
        }
    }

    private static Catalog findCatalogById(int catalogId) {
        for (Catalog catalog : catalogList) {
            if (catalog.getCatalogId() == catalogId) {
                return catalog;
            }
        }
        return null;
    }

    private static void displayProducts() {
        for (Product product : productsList) {
            product.displayData();
        }
    }

    private static void sortProductsByPrice() {
        Collections.sort(productsList, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return (int) (p1.getExportPrice() - p2.getExportPrice());
            }
        });

        System.out.println("Danh sách sản phẩm sau khi sắp xếp theo giá tăng dần:");
        displayProducts();
    }

    private static void searchProductByCatalog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên danh mục sản phẩm cần tìm kiếm: ");
        String catalogName = scanner.nextLine();


        for (Product product : productsList) {
            if (product.getCatalog().getCatalogName().contains(catalogName)) {
                product.displayData();
            }
        }


    }

}
