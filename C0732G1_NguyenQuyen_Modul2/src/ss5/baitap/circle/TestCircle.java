package ss5.baitap.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());

    }
    public static class Circle {
        private double radius = 1.0;
        private String color = "red";

        public double getRadius() {
            return radius;
        }

        public String getColor() {
            return color;
        }

        public Circle() {
        }

        public double getArea() {
            return 3.14 * radius * radius;
        }

    }
}
