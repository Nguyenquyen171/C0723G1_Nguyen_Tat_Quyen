package ss10.Exercise;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
    MyList<String> myList = new MyList<>(3);
    myList.add(0,"1");
    myList.add(1,"2");
    myList.add(2,"3");
    myList.add(3,"4");
    myList.add(4,"5");
    myList.add(5,"6");
    myList.add(6,"7");
        System.out.println(myList);
        System.out.println(myList.isEmpty());
        Object[] elements=(Object[]) myList.clone();
        System.out.println(Arrays.toString(elements));
        myList.remove(5);
        System.out.println(myList);
        myList.clear();
        System.out.println(myList);
    }

}
