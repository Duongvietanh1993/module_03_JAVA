package ra.bussinessImp;

import ra.bussiness.IShop;

import java.util.Scanner;

public class Catalog implements IShop {
    private int catalogId;
    private String catalogName;
    private int priority;
    private String descriptions;
    private boolean catalogStatus;

    static int countId = 1;

    public Catalog() {
        this.catalogId = countId++;
    }

    public Catalog(String catalogName, int priority, String descriptions, boolean catalogStatus) {
        this.catalogId = countId++;
        this.catalogName = catalogName;
        this.priority = priority;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên danh mục: ");
        this.catalogName = scanner.nextLine();
        System.out.println("Độ ưu tiên: ");
        this.priority = Integer.parseInt(scanner.nextLine());
        System.out.println("Mô tả danh mục: ");
        this.descriptions = scanner.nextLine();
        System.out.println("Trạng thái danh mục (true/false): ");
        this.catalogStatus = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println(
                "--- Catalog ---" + '\n' +
                        "catalogId: " + catalogId + '\n' +
                        "catalogName: " + catalogName + '\n'
        );

    }


}
