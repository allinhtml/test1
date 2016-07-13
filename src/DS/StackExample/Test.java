package DS.StackExample;

/**
 * Created by prvikani on 6/22/2016.
 */
public class Test<E> {
    private Node first = null;

    public static void main(String args[]) {
        Test<Integer> t = new Test<Integer>();
        t.push(12);
        t.push(1);
        t.push(14);
        t.push(4);
        t.push(52);
        t.push(4);
        int s = t.getMinimum();
        System.out.println("Minimum number is :" + s);
    }

    public void push(E n) {
        Node newNode = new Node();
        newNode.item = n;
        newNode.next = first;
        first = newNode;
    }

    public E pop() {
        E temp;
        temp = first.item;
        first = first.next;
        return temp;

    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        int counter = 0;
        Node temp = first;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;

    }

    E getMinimum() {
        Node temp = first;
        E min = first.item;
        while (temp != null) {
            if (Integer.parseInt(min.toString()) > Integer.parseInt(temp.item.toString())) {
                min = temp.item;
            }
            temp = temp.next;
        }
        return min;
    }

    private class Node {
        E item;
        Node next;

    }
}
