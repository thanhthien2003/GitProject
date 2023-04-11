package bai_3.repository;

import bai_3.model.HoaDonTienDien;

import java.util.List;

public interface IRepoHoaDon {
    void add(List<HoaDonTienDien> hoaDonTienDienList);
    List<HoaDonTienDien> display();
}
