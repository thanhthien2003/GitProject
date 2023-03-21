package java_collection_framework.controllers;

import java_collection_framework.models.Product;
import java_collection_framework.service.ProductService;

import java.util.Scanner;

public class ProductManager {

    public static void display() {
        ProductService productService = new ProductService();
        Scanner sc = new Scanner(System.in);
        boolean flag;
        do {
             flag = true;
            try {
                System.out.println("Moi ban chon menu: " +
                        "\n 1.Them san pham " +
                        "\n 2.sua thong tin" +
                        "\n 3.xoa san pham theo id" +
                        "\n 4.Hien thi danh sach san pham" +
                        "\n 5.tim kiem san pham theo ten" +
                        "\n 6.Sap xep san pham tang dang hoac giam dan theo gia");
                int choose = sc.nextInt();
                switch (choose) {
                    case 1:
                        System.out.println("1.them san pham");
                        productService.add();
                        break;
                    case 2:
                        System.out.println("sua thong tin");
                        System.out.println("nhap id muon sua");
                        boolean flag2=true;
                        do {
                            int id = sc.nextInt();
                            if (productService.check(id)) {
                                productService.edit(id);
                            } else {
                                System.out.println("ID khong hop le");
                                flag2 = false;
                            }
                        }while (!flag2);
                        break;
                    case 3:
                        System.out.println("xoa san pham theo id");
                        int id2 = sc.nextInt();
                        if (productService.check(id2)) {
                            System.out.println("1.Xóa " +
                                    "\n 2. Không xóa ");
                            int choose1 = Integer.parseInt(sc.nextLine());
                            switch (choose1) {
                                case 1:
                                    productService.delete(id2);
                                    System.out.println("xoa thanh cong");
                                    break;
                                default:
                                    System.out.println(" Bạn đã   không xóa ");
                                    break;
                            }
                        }
                    case 4:
                        System.out.println("4.Hiển thị danh sách sản phầm ");
                        productService.display();
                        break;
                    case 5:
                        System.out.println("5.Tìm kiếm sản phẩm theo tên ");
                        productService.search();
                        break;
                    case 6:
                        System.out.println("6.Sắp xếp sản phẩm tăng dần , giảm dần theo giá ");
                        System.out.println("-------------00------------");
                        productService.arrange();
                        break;
                    default:
                        flag = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println("nội dung nhập vào không hợp lệ , có thể sai chính tả hoặc dùng ký tự đặc biệt");
            }
        } while (flag);

    }
}
