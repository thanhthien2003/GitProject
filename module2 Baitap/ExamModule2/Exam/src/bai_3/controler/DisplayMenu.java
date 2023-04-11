package bai_3.controler;

import bai_3.service.HoaDonService;
import bai_3.service.IHoaDonService;

import java.util.Scanner;

public class DisplayMenu {
    public void displayMenu(){
        Scanner sc = new Scanner(System.in);
        IHoaDonService hoaDonService = new HoaDonService();
        boolean flag =true;
        System.out.println("--------Hóa đơn tiền điện-------");
        do {
            System.out.println("Chọn các thao tác sau:"+
                    "\n 1. Hiển thị danh sách hóa đơn" +
                    "\n 2. Thêm mới hóa đơn tiền điện"+
        "\n 3.Thoát");
            String choose = sc.nextLine();
            switch (choose){
                case "1":
                    hoaDonService.display();
                    break;
                case "2":
                    hoaDonService.add();
                    break;
                case "3":
                    System.out.println("Xin cảm ơn");
                    flag = false;
            }
        } while (flag);
    }
}
