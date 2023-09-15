package ss10.Exercise;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index> size || index <0) {
            throw new ArithmeticException("The index: " + index + " out of bound" );
        } else {
            if (size == elements.length) {
                ensureCapacity(size + 1);
            }
            for (int i = size - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            size++;
        }
    }
    public E remove(int index){
        if (index < 0 || index >= size) {
            throw new ArithmeticException("The index: " + index + " out of bound");
        } else {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size - 1] = null;

        }
        size--;
        return (E) elements[index];
    }
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }
    public  String toString(){
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(elements[i]);
            if (i<size-1){
                result.append(", ");
            }
        }
        return result.toString() + "]";
    }
    public Object clone(){
        Object[] newArr = new Object[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = elements[i];
        }
        return newArr;
    }
    public void clear (){
        Object[] newArray= new Object[0];
        size=0;
        elements=newArray;
    }
    boolean isEmpty(){
        if(size!=0){
            return false;
        }
        return true;
    }
}


