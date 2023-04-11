package ss5_lam_lai;

public class PersonABC {
    /* sử dụng trường private để thể hiện tính bao đóng của đối tượng */
    private String name;
    private int numberPhone;
    private String position;
    private static String nameCompany = "Cong ty thuong mai ABC";
    /* sử dụng static cho tên công ty vì tên công ty là đối tượng sử dụng chung*/

    public PersonABC() {
    }

    public PersonABC(String name, int numberPhone, String position) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static String getNameCompany() {
        return nameCompany;
    }

    public static void setNameCompany(String nameCompany) {
        PersonABC.nameCompany = nameCompany;
    }

    @Override
    public String toString() {
        return "PersonABC{" +
                "name='" + name + '\'' +
                ", numberPhone=" + numberPhone +
                ", position='" + position + '\'' +
                '}';
    }
}
