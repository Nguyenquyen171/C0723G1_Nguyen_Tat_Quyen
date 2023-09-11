package ss6.baitap;

public class Point2D {
    public static void main(String[] args) {

    }
    public static class PointD{
        float x=0.0f;
        float y=0.0f;
        public PointD (float x, float y ){
            this.x=x;
            this.y=y;
        }
        public PointD(){
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
    }
}
