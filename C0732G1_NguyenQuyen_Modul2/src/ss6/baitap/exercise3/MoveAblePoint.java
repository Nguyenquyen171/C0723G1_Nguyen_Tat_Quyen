package ss6.baitap.exercise3;

public class MoveAblePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arraySpeed = new float[2];
        arraySpeed[0] = this.xSpeed;
        arraySpeed[1] = this.ySpeed;
        return arraySpeed;

    }
    public MoveAblePoint move() {
        this.setX(this.getX() + this.getXSpeed());
        this.setY(this.getY() + this.getYSpeed());
        return this;
    }

    public MoveAblePoint() {
    }

    @Override
    public String toString() {
        return " Move Able Point has :" +
                "[" + getX() + "," + getY() +
                "], speed = [" + getXSpeed() +
                "," + getYSpeed() +
                "]";
    }


}
