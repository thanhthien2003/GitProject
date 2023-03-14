package resizeable;

public class Rectangle extends Shape  {
    protected double shortEdge=1;
    protected double longEdge=3;
    public Rectangle() {
    }

    public Rectangle(double shortEdge, double longEdge) {
        this.shortEdge = shortEdge;
        this.longEdge = longEdge;
    }

    public double getShortEdge() {
        return shortEdge;
    }

    public void setShortEdge(double shortEdge) {
        this.shortEdge = shortEdge;
    }

    public double getLongEdge() {
        return longEdge;
    }

    public void setLongEdge(double longEdge) {
        this.longEdge = longEdge;
    }

    public double getArea(){
        return ((getLongEdge()*getShortEdge()));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "shortEdge=" + shortEdge +
                ", longEdge=" + longEdge + ", Area=" + getArea() +
                '}';
    }

    @Override
    public void resizeShape(double percent) {
        this.setLongEdge(longEdge += this.getLongEdge() * percent / 100);
        this.setShortEdge(shortEdge += this.getShortEdge()*percent/100);
    }
}
