package ss6.baitap.exercise1;

public class Cylinder extends Circle {
    private double height = 5;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolumeCylinder() {
        return 3.14 * Math.pow(getRadius(), 2) * height;
    }
    public Cylinder(){

    }

    @Override
    public String toString() {
        return "The " +getColor() + " cylinder has a volume of " +
                getVolumeCylinder() +
                " with radius " + getRadius() +
                " and height " + height;
    }
}
