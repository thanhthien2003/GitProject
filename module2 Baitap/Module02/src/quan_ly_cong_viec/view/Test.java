package quan_ly_cong_viec.view;

import quan_ly_cong_viec.controler.MenuQuanLy;
import quan_ly_cong_viec.service.IdNotFoundException;
import quan_ly_cong_viec.service.UniqueIDException;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws UniqueIDException, IdNotFoundException {
        MenuQuanLy.menuQuanLy();
    }
}
