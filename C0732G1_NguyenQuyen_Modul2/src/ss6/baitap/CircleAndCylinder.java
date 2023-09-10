package ss6.baitap;

public class CircleAndCylinder {

    public static void main(String[] args) {
        Circle circle=new Circle();
        Cylinder cylinder=new Cylinder();
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle volume:"  + circle.getVolume());
        System.out.println();
        System.out.println("Cylinder area:" +cylinder.getAreaCylinder() );
        System.out.println("Cylinder volume:" +cylinder.getAreaCylinder() );

    }

    public static class Circle {
        double radius = 5;
        String color = "Red";

        public Circle() {

        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public double getArea() {
            return 3.14 * radius * radius;
        }

        public double getVolume() {
            return 4 / 3 * 3.14 * radius * radius * radius;
        }



    }

    public static class Cylinder {
        double radiusCylinder = 7;
        double heightCylinder = 9;

        public double getRadiusCylinder() {
            return radiusCylinder;
        }
        public Cylinder(){

        }

        public void setRadiusCylinder(double radiusCylinder) {
            this.radiusCylinder = radiusCylinder;
        }

        public double getHeightCylinder() {
            return heightCylinder;
        }

        public void setHeightCylinder(double heightCylinder) {
            this.heightCylinder = heightCylinder;
        }

        public double getAreaCylinder() {
            return 2 * 3.14 * radiusCylinder * heightCylinder;
        }

        public double getVolumeCylinder() {
            return 3.14 * radiusCylinder * radiusCylinder * heightCylinder;
        }

    }
}
