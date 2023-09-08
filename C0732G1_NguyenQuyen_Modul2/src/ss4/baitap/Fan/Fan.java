package ss4.baitap.Fan;

public class Fan {
    final int SLOW = 1;
    final int FAST = 2;
    final int MEDIUM = 3;
    private int speed = SLOW;
    private boolean turnOn = false;
    private double radius = 5;
    private String color = "blue";

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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

    public Fan() {
    }

    private String getSpeed() {
        String result = "";
        if (speed == 1) {
            result += "Speed slow";
        } else if (speed == 2) {
            result += "Speed medium";
        } else {
            result += "Speed fast";
        }
        return result;
    }

    public String toString() {
        if (this.isTurnOn()) {
            return "Speed: " + getSpeed() + "\n" +
                    "Color: " + getColor() + "\n" +
                    "radius : " + getRadius() + "\n" +
                    "Fan is on";
        } else {
            return "Color: " + getColor() + "\n" +
                    "radius : " + getRadius() + "\n" +
                    "Fan is Off";
        }

    }


    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setTurnOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setTurnOn(false);

        System.out.println("The properties of the 1st fan are :");
        System.out.println(fan1);
        System.out.println();
        System.out.println("The properties of the 2st fan are :");
        System.out.println(fan2);
    }


}

