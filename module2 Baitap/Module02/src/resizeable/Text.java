package resizeable;

import java.util.Arrays;

public class Text {
    public static void main(String[] args) {
        double x =Math.floor(Math.random()*100);
        Shape [] shape = new Shape[3];
        shape[0]= new Circle();
        shape[1]= new Rectangle();
        shape[2]= new Square();
        System.out.println("truoc khi tang kich thuoc");
        System.out.println(Arrays.toString(shape));
        shape.toString();
        for (Shape i : shape){
            i.resizeShape(x);
        }
        System.out.println("sau khi tang la =" + Arrays.toString(shape));
        System.out.println("phan tram tang la " + x);
    }
}
