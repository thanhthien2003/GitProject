package quan_ly_cong_viec.repository;

import quan_ly_cong_viec.model.ChiTieu;

import java.util.List;

public interface IRepoChiTieu {
    List<ChiTieu> display();
    boolean add(ChiTieu chiTieu);
    boolean delete(String maChiTieu);
    boolean edit(ChiTieu chiTieu);
    ChiTieu searchMaChiTieu(String maChiTieu);
    ChiTieu searchTenChiTieu(String tenChiTieu);
}
