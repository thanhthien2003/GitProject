package circle_and_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    public Cylinder() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double volume(){
        return this.getAcreage() * this.height ;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + this.getRadius() +
                ", color=" + this.getColor() + ", the tich= " + this.volume() + '\'' + "height=" + height +
                '}';
    }
}
