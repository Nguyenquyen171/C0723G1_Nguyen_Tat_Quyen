package ss6.baitap.exercise2;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arrayXYZ = new float[3];
        arrayXYZ[2] = this.z;
        return arrayXYZ;
    }

    @Override
    public String toString() {
        return "Array XYZ has :" +
                "[" + getX() + "," + getY() + "," + getZ() +
                "]";
    }
}