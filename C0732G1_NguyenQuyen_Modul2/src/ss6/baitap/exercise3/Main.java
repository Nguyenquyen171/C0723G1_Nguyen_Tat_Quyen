package ss6.baitap.exercise3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        Point pointOne= new Point(3,2);
        System.out.println(pointOne);
        System.out.println();
        MoveAblePoint moveAblePoint= new MoveAblePoint();
        System.out.println(moveAblePoint);
        MoveAblePoint moveAblePointOne= new MoveAblePoint(3,5,4,6);
        System.out.println(moveAblePointOne);
        System.out.println(moveAblePointOne.move());
    }
}
