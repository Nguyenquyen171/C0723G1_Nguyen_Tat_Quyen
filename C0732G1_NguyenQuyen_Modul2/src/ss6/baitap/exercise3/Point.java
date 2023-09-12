package ss6.baitap.exercise3;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arrayXY = new float[2];
        arrayXY[0] = this.x;
        arrayXY[1] = this.y;
        return arrayXY;
    }

    public Point() {

    }

    @Override
    public String toString() {
        return " XY has :" +
                "[" + getX() + "," + getY() +
                "]";
    }

}
