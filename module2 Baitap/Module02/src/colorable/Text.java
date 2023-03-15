package colorable;

public class Text {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[2];
        shapes[0]=new Circle();
        shapes[1]=new Square();
        for(Shape i:shapes){
            if(i instanceof Colorable){
                System.out.println(i);
                ((Colorable) i).howToColor();
            }
        }
        System.out.println(shapes[0]);
    }
}
