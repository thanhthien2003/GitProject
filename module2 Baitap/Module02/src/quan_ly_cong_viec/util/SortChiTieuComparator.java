package quan_ly_cong_viec.util;

import quan_ly_cong_viec.model.ChiTieu;

import java.util.Comparator;

public class SortChiTieuComparator implements Comparator<ChiTieu> {
    @Override
    public int compare(ChiTieu o1, ChiTieu o2) {
        if (o1.getSoTienChi() == o2.getSoTienChi()) {
            return o2.getTenChiTieu().compareTo(o1.getTenChiTieu());
        } else if (o2.getSoTienChi() - o1.getSoTienChi() > 0) {
            return 99;
        } else {
            return -1;
        }
    }
    }

