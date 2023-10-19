package demo.bussinessImp;

import demo.bussiness.IShop;

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

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
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
        System.out.println("Họ và tên: ");
        this.productName = scanner.nextLine();
        System.out.println("Tiêu đề sản phẩm: ");
        this.title = scanner.nextLine();
        System.out.println("Mô tả sản phẩm: ");
        this.descriptions = scanner.nextLine();
        System.out.println("Giá nhập sản phẩm: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập trạng thái sản phẩm (true/false): ");
        this.productStatus = Boolean.parseBoolean(scanner.nextLine());
        this.exportPrice= importPrice*RATE;
    }


    @Override
    public void displayData() {
        System.out.println(
                "--- Product ---" + '\n' +
                        "productId: " + productId + '\n' +
                        "productName: " + productName + '\n'+
                        "catalog: " + catalog.getCatalogName() + '\n'+
                        "exportPrice: " + exportPrice + '\n'+
                        "productStatus: " + productStatus + '\n'
        );
    }



}
