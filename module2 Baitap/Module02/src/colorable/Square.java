package colorable;

public class Square extends Shape implements Colorable {
    private double edge = 2;

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



    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public double getArea(){
        return edge * edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge + ",Area=" + this.getArea()+
                '}';
    }
}
