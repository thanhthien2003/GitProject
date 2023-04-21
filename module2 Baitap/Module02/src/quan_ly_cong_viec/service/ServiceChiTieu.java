package quan_ly_cong_viec.service;

import quan_ly_cong_viec.model.ChiTieu;
import quan_ly_cong_viec.repository.IRepoChiTieu;
import quan_ly_cong_viec.repository.RepoChiTieu;
import quan_ly_cong_viec.util.SortChiTieuComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ServiceChiTieu implements IServiceChiTieu {
    static Scanner sc = new Scanner(System.in);
 static IRepoChiTieu repoChiTieu = new RepoChiTieu();

    @Override
    public void display() {
        for (ChiTieu c : repoChiTieu.display()) {
            System.out.println(c);
        }
    }

    @Override
    public void add() throws UniqueIDException {
            String maChiTieu = null;
                System.out.println("nhap Ma chi tieu");
                maChiTieu = sc.nextLine();
                for (ChiTieu c : repoChiTieu.display()) {
                    if (maChiTieu.equals(c.getMaChiTieu())) {
                        throw new UniqueIDException("Ma da trung lap");
                    }
                }
            System.out.println("nhap Ten chi tieu");
            String tenChiTieu = sc.nextLine();
            System.out.println("nhap ngay chi tieu");
            String ngayChiTieu = sc.nextLine();
            System.out.println("nhap so tien chi");
            long soTienChi = Long.parseLong(sc.nextLine());
            System.out.println("nhap mo ta them");
            String moTaThem = sc.nextLine();
            ChiTieu chiTieu = new ChiTieu(maChiTieu, tenChiTieu, ngayChiTieu, soTienChi, moTaThem);
            if (repoChiTieu.add(chiTieu)) {
                System.out.println("Them moi chi tieu thanh cong");
            } else {
                System.out.println("Them moi khong thanh cong");
            }
    }

    @Override
    public void delete() throws IdNotFoundException{
        System.out.println("nhap Ma chi tieu muon xoa");
        String maChiTieu = sc.nextLine();
        if (repoChiTieu.delete(maChiTieu)) {
            System.out.println("Xoa thanh cong ");
        } else {
            throw new IdNotFoundException("ID khong tai, moi nhap lai");
        }
    }

    @Override
    public void edit() {
        System.out.println("nhap ma chi tieu muon chinh sua");
        String maChiTieu = sc.nextLine();
        boolean flag = false;
        for (ChiTieu c : repoChiTieu.display()) {
            if (maChiTieu.equals(c.getMaChiTieu())) {
                System.out.println("nhap Ten chi tieu");
                String tenChiTieu = sc.nextLine();
                System.out.println("nhap ngay chi tieu");
                String ngayChiTieu = sc.nextLine();
                System.out.println("nhap so tien chi");
                long soTienChi = Long.parseLong(sc.nextLine());
                System.out.println("nhap mo ta them");
                String moTaThem = sc.nextLine();
                ChiTieu chiTieu = new ChiTieu(maChiTieu, tenChiTieu, ngayChiTieu, soTienChi, moTaThem);
                if (repoChiTieu.edit(chiTieu)) {
                    flag = true;
                    System.out.println("Chinh sua thanh cong");
                } else {
                    flag = false;
                }
            }
        }
        if (!flag) {
            System.out.println("Chinh sua khong thanh cong");
        }
    }

    @Override
    public void searchById() {
        System.out.println("Nhap ma chi tieu can tim kiem");
        String maChiTieu = sc.nextLine();
        if (repoChiTieu.searchMaChiTieu(maChiTieu) == null) {
            System.out.println("Khong tim thay chi tieu nay");
        } else {
            System.out.println(repoChiTieu.searchMaChiTieu(maChiTieu));
        }
    }

    @Override
    public void searchByName() {
        System.out.println("Nhap ten chi tieu can tim kiem");
        String tenChiTieu = sc.nextLine();
        if (repoChiTieu.searchTenChiTieu(tenChiTieu) == null) {
            System.out.println("Khong tim thay chi tieu nay");
        } else {
            System.out.println(repoChiTieu.searchTenChiTieu(tenChiTieu));
        }
    }

    @Override
    public void sortName() {
        List<ChiTieu> chiTieuList = repoChiTieu.display();
        Collections.sort(chiTieuList);
        for (ChiTieu c:chiTieuList) {
            System.out.println(c);
        }
    }

    @Override
    public void sortChiTieu() {
        List<ChiTieu> chiTieuList = repoChiTieu.display();
        Collections.sort(chiTieuList, new SortChiTieuComparator());
        for (ChiTieu c:chiTieuList) {
            System.out.println(c);
        }
    }
}
