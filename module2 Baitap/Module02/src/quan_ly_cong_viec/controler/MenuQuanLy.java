package quan_ly_cong_viec.controler;

import quan_ly_cong_viec.service.IServiceChiTieu;
import quan_ly_cong_viec.service.ServiceChiTieu;

import java.util.Scanner;

public class MenuQuanLy {
    public static void menuQuanLy() {
        Scanner sc = new Scanner(System.in);
        IServiceChiTieu serviceChiTieu = new ServiceChiTieu();
        System.out.println("----------Quan ly cong viec---------");
        boolean flag;
        do {
            System.out.println("---Quan ly chi tieu---" +
                    "\n 0. Thoat" +
                    "\n 1. Hien thi danh sach" +
                    "\n 2. Them chi tieu" +
                    "\n 3. Xoa chi tieu" +
                    "\n 4. Sua chi tieu" +
                    "\n 5. Tim kiem theo ma chi tieu" +
                    "\n 6. Tim kiem gan dung theo ten chi tieu" +
                    "\n 7. Hien thi va sap xep danh sach theo ten tang dan" +
                    "\n 8. Hien thi va sap xep theo so tien chi giam dan" );
            String choose = sc.nextLine();
            switch (choose){
                case "1":
                    serviceChiTieu.display();
                    flag = true;
                    break;
                case "2":
                    serviceChiTieu.add();
                    flag = true;
                    break;
                case "3":
                    serviceChiTieu.delete();
                    flag = true;
                    break;
                case "4":
                    serviceChiTieu.edit();
                    flag = true;
                    break;
                case "5":
                    serviceChiTieu.searchById();
                    flag = true;
                    break;
                case "6":
                    serviceChiTieu.searchByName();
                    flag = true;
                    break;
                case "7":
                    serviceChiTieu.sortName();
                    flag = true;
                    break;
                case "8":
                    serviceChiTieu.sortChiTieu();
                    flag = true;
                    break;
                case "0":
                    flag = false;
                    System.out.println("Xin cam on");
                    break;
                default:
                    flag=true;
                    System.out.println("Nhap sai lua chon , xin moi chon lai");
            }
        } while (flag);
    }
}
