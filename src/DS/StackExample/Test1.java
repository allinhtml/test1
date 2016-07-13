package DS.StackExample;

/**
 * Created by prvikani on 6/22/2016.
 */
public class Test1<E> {
    E[] stack;
    int top = 0;

    public Test1(int capacity) {
        stack = (E[]) new Object[capacity];
    }

    public static void main(String arg[]) {
        Test1<Integer> t1 = new Test1<Integer>(10);
        t1.push(12);
        t1.push(1);
        t1.push(14);
        t1.push(4);
        t1.push(52);
        t1.push(4);
        int s = t1.getMinimum();
        System.out.println("Minimum number is :" + s);

    }

    public void push(E item) {

        stack[top] = item;
        top++;
    }

    public E pop() {
        top--;
        return stack[top];

    }

    boolean isEmpty() {
        return top == 0;

    }

    int size() {
        return top;
    }

    E getMinimum() {
        E min = stack[0];
        for (int i = 0; i < top; i++) {
            if (Integer.parseInt(min.toString()) > Integer.parseInt(stack[i].toString())) {
                min = stack[i];
            }
        }
        return min;
    }


}
