package ss4.baitap.QuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(this.getB(), 2) - this.getA() * 4 * this.c;
        return delta;
    }

    public double root1() {
        double doubleSolution = -this.getB() / (this.getA() * 2);
        return doubleSolution;
    }
    public double root2() {
        double  distinctSolutionsOne = (-this.getB() + this.getDiscriminant())/(2*this.getA());
        return distinctSolutionsOne;
    }
    public double root3() {
        double  distinctSolutionsTwo = (-this.getB() - this.getDiscriminant())/(2*this.getA());
        return distinctSolutionsTwo;
    }
}

