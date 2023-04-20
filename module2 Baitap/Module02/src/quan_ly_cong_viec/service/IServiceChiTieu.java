package quan_ly_cong_viec.service;

public interface IServiceChiTieu {
    void display();
    void add() throws UniqueIDException;
    void delete() throws IdNotFoundException;
    void edit();
    void searchById();
    void searchByName();
    void sortName();
    void sortChiTieu();
}
