package ss7.baitap.interface_resizeable;
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(5);
        System.out.println("Before resize");
        for (Shape x : shapes) {
            System.out.println(x);
        }

        System.out.println();
        System.out.println("After resize:");
        double random = Math.random() * 100 + 1;
        for (Shape x : shapes) {
            x.resize(random / 100);
            System.out.println(x);
        }
    }
}

