package ss6.baitap.exercise1;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle() {
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        return "The " +getColor() + " circle has a area of " +
        getArea() +
                " with radius " + getRadius();
    }
}

