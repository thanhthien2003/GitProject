package ss6_lam_lai;

public class Cylinder extends Circle{
    //* TỪ KHÓA extends để lớp Cylinder kế thừa lại lớp Circle *//
    private double height;
    //* thành phần không được kế thừa chính là radius và color 2 thuộc tính thuộc trường private của lớp cha *//
    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color); //* TỪ KHÓA SUPER ĐỂ GỌI LẠI CONTRUCTOR CỦA LỚP CHA *//
        this.height = height;
    }
    //* contructor Cylinder() và Cylinder(double radius,String color, double height)
    // chính là cơ chế overload khi định nghĩa ra 2 method cùng tên nhưng khác tham số truyền vào *//

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height is " + this.height + ", which is subclass of " + super.toString();
    }
    //* phương thức toString chính là ví dụ thực tế cho override khi ghi đè lại nội dung của lớp cha *//
}
