package ra.bussinessImp;

import ra.bussiness.IShop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Product implements IShop {
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;

    static int countId = 1;

    public Product() {
        this.productId = countId++;
    }

    public Product(String productName, String title, String descriptions, Catalog catalog, float importPrice, float exportPrice, boolean productStatus) {
        this.productId = countId++;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.productStatus = productStatus;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên sản phẩm (nhập chữ): ");
        this.productName = scanner.nextLine();
        System.out.println("Tiêu đề sản phẩm (nhập chữ): ");
        this.title = scanner.nextLine();
        System.out.println("Mô tả sản phẩm (nhập chữ): ");
        this.descriptions = scanner.nextLine();
        System.out.println("Giá nhập sản phẩm (nhập số): ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println(
                "Trạng thái sản phẩm: " + '\n' +
                        "1.True" + '\n' +
                        "2.False" + '\n'
        );
        this.productStatus = Integer.parseInt(scanner.nextLine()) == 1;
        this.exportPrice= importPrice*RATE;
    }
    DecimalFormat formatter = new DecimalFormat("###,###,###");

    @Override
    public void displayData() {
        System.out.println(
                "--- Product ---" + '\n' +
                        "productId: " + productId + '\n' +
                        "productName: " + productName + '\n'+
                        "catalog: " + catalog.getCatalogName() + '\n'+
                        "exportPrice: " + (formatter.format(exportPrice)) + '\n'+
                        "productStatus: " + productStatus + '\n'
        );
    }



}
