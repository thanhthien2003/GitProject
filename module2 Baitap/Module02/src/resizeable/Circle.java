package resizeable;

public class Circle extends Shape {
    private double radius=1;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(double radius){
        this.radius=radius;
        double area = radius*radius * Math.PI;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getArea(radius)+
                '}';
    }



    @Override
    public void resizeShape(double percent) {
        this.setRadius(radius += this.getRadius() * percent / 100);

    }
}
