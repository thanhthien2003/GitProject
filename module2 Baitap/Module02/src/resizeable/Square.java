package resizeable;

public class Square extends Shape  {
    private double edge = 1;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea(){
        return ((edge*edge));
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge + ", Area=" + getArea() +
                '}';
    }

    @Override
    public void resizeShape(double percent) {
        this.setEdge(edge += this.getEdge() * percent / 100);
    }
}
