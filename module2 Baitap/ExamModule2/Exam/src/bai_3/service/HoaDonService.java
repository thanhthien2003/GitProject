package bai_3.service;

import bai_3.model.HoaDonTienDien;
import bai_3.repository.IRepoHoaDon;
import bai_3.repository.RepoHoaDon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoaDonService implements IHoaDonService {
    static List<HoaDonTienDien> hoaDonTienDienList = new ArrayList<>();
    static IRepoHoaDon repoHoaDon = new RepoHoaDon();
    static Scanner sc = new Scanner(System.in);
    static String regEx = "^MHD-[0-9]{4}";

    @Override
    public void add() {
        boolean flag;
        System.out.println("Nhập mã hóa đơn mới");
        String maHoaDon;
        do {
            flag = false;
            maHoaDon = sc.nextLine();
            boolean flag1 = maHoaDon.matches(regEx);
            if (!flag1) {
                flag = true;
                System.out.println("Yêu cầu nhập đúng định dạng MHD-XXXX");
            }
        } while (flag);
        System.out.println("Nhập họ và tên khách hàng");
        String hoVaten;
        do {
            flag = false;
            hoVaten = sc.nextLine();
            if (hoVaten.equals("")) {
                System.out.println("Bạn chưa nhập gì cả , mời nhập lại");
                flag = true;
            }
        } while (flag);
        String loaiKhachHang=null;
        do {
            System.out.println("Mời bạn chọn loại khách hàng" +
                    "\n 1. Sinh hoạt" +
                    "\n 2. Kinh doanh");
            String choose = sc.nextLine();
            switch (choose){
                case "1":
                    loaiKhachHang = "Sinh hoạt";
                    flag =false;
                    break;
                case "2":
                    loaiKhachHang = "Kinh doanh";
                    flag = false;
                    break;
                default:
                    flag = true;
                    System.out.println("lựa chọn của bạn không tồn tại , mời nhập lai");
            }
        }while (flag);
        System.out.println("Nhập định mức tiêu thụ");
        long dinhMucTieuThu=0;
        do {
            flag = false;
            try {
                dinhMucTieuThu = Long.parseLong(sc.nextLine());
                if (dinhMucTieuThu<=0){
                    flag = true;
                    System.out.println("Định mức tiêu thụ phải là số nguyên dương, mời nhập lại ");
                }
            }catch (Exception e){
                System.out.println("định mức tiêu thụ chỉ được nhập số, mời nhập lại");
                flag = true;
            }
        }while (flag);
        HoaDonTienDien hoaDonTienDien = new HoaDonTienDien(maHoaDon,hoVaten,loaiKhachHang,dinhMucTieuThu);
        hoaDonTienDienList.add(hoaDonTienDien);
        repoHoaDon.add(hoaDonTienDienList);
    }

    @Override
    public void display() {
        hoaDonTienDienList = repoHoaDon.display();
        for (HoaDonTienDien h:hoaDonTienDienList) {
            System.out.println(h);
        }
    }
}
