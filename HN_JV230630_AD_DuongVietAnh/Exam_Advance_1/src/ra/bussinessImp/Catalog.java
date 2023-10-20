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

    public String getCatalogName() {
        return catalogName;
    }


    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên danh mục (nhập chữ): ");
        this.catalogName = scanner.nextLine();
        System.out.println("Độ ưu tiên (nhập số): ");
        this.priority = Integer.parseInt(scanner.nextLine());
        System.out.println("Mô tả danh mục (nhập chữ): ");
        this.descriptions = scanner.nextLine();
        System.out.println(
                "Trạng thái danh mục: " + '\n' +
                        "1.True" + '\n' +
                        "2.False" + '\n'
        );
        this.catalogStatus = Integer.parseInt(scanner.nextLine()) == 1;
    }

    @Override
    public void displayData() {
        System.out.println(
                "---- Catalog" + catalogId + " ----" + '\n' +
                        "catalogId: " + catalogId + '\n' +
                        "catalogName: " + catalogName + '\n'
        );

    }


}
