package ss7.baitap.interface_resizeable;

import ss7.baitap.interface_colorable.InterfaceColorable;

public class Square extends Rectangle implements Resizeable, InterfaceColorable {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public double getArea(){
        return getSide()*getSide();
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()+getSide()*percent);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}


