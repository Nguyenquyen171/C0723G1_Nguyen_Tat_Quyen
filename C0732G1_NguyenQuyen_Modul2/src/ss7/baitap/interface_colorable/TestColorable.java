package ss7.baitap.interface_colorable;

import ss7.baitap.interface_resizeable.Circle;
import ss7.baitap.interface_resizeable.Rectangle;
import ss7.baitap.interface_resizeable.Shape;
import ss7.baitap.interface_resizeable.Square;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(30);
        shape[1] = new Rectangle(6, 10);
        shape[2] = new Square(7);
        for (int i = 0; i < shape.length; i++) {
            System.out.println(shape[i]);
            if (shape[i] instanceof InterfaceColorable) {
                ((InterfaceColorable) shape[i]).howToColor();
            }
        }
    }

}
