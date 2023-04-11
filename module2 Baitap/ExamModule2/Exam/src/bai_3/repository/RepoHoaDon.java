package bai_3.repository;

import bai_3.model.HoaDonTienDien;
import bai_3.util.ReadAndWriteHoaDon;

import java.util.List;

public class RepoHoaDon implements IRepoHoaDon{
    static final String FILE_HOA_DON = "src\\bai_3\\data\\hoa_don.csv";
    @Override
    public void add(List<HoaDonTienDien> hoaDonTienDienList) {
        ReadAndWriteHoaDon.writeFile(FILE_HOA_DON,hoaDonTienDienList,false);
    }

    @Override
    public List<HoaDonTienDien> display() {
        List<HoaDonTienDien> hoaDonTienDienList = ReadAndWriteHoaDon.readFile(FILE_HOA_DON);
        return hoaDonTienDienList;
    }
}
