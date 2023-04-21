package quan_ly_cong_viec.repository;

import quan_ly_cong_viec.model.ChiTieu;
import quan_ly_cong_viec.service.IServiceChiTieu;
import quan_ly_cong_viec.service.ServiceChiTieu;
import quan_ly_cong_viec.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class RepoChiTieu implements IRepoChiTieu {
    static List<ChiTieu> chiTieuList = ReadAndWrite.readFile();


//    static {
//        ChiTieu chiTieu = new ChiTieu("TD", "Tien dien", "20/20/2000", 2000, "ok");
//        ChiTieu chiTieu2 = new ChiTieu("TN", "Tien nuoc", "20/20/2000", 3000, "ok");
//        ChiTieu chiTieu3 = new ChiTieu("TVS", "Tien ve sinh", "20/20/2000", 4000, "ok");
//        ChiTieu chiTieu4 = new ChiTieu("TR", "Tien rac", "20/20/2000", 5000, "ok");
//        chiTieuList.add(chiTieu);
//        chiTieuList.add(chiTieu2);
//        chiTieuList.add(chiTieu3);
//        chiTieuList.add(chiTieu4);
//    }

    @Override
    public List<ChiTieu> display() {
        return ReadAndWrite.readFile();
    }

    @Override
    public boolean add(ChiTieu chiTieu) {
        chiTieuList.add(chiTieu);
        ReadAndWrite.writeFile(chiTieuList,false);
        return true;
    }

    @Override
    public boolean delete(String maChiTieu) {
        boolean flag = false;
        for (ChiTieu c : chiTieuList) {
            if (maChiTieu.equals(c.getMaChiTieu())){
                chiTieuList.remove(c);
                flag = true;
                break;
            }
        }
        ReadAndWrite.writeFile(chiTieuList,false);
        return flag;
    }

    @Override
    public boolean edit(ChiTieu chiTieu) {
        for (int i = 0; i < chiTieuList.size(); i++) {
            if (chiTieuList.get(i).getMaChiTieu().equals(chiTieu.getMaChiTieu())){
                chiTieuList.set(i,chiTieu);
                ReadAndWrite.writeFile(chiTieuList,false);
                return true;
        }
        }
        return false;
    }

    @Override
    public ChiTieu searchMaChiTieu(String maChiTieu) {
        for (ChiTieu c:chiTieuList) {
            if (maChiTieu.equals(c.getMaChiTieu())){
                return c;
            }
        }
        return null;
    }

    @Override
    public ChiTieu searchTenChiTieu(String tenChiTieu) {
        for (ChiTieu c:chiTieuList) {
            if (c.getTenChiTieu().toLowerCase().contains(tenChiTieu.toLowerCase())){
                return c;
            }
        }
        return null;
    }
}
