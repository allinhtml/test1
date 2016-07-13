package DS.StackExample;

/**
 * Created by prvikani on 6/22/2016.
 */
public class Problem6GetMinimumWithOptimized {

    Node first1 = null;
    Node first2 = null;
    private int size = 0;

    public static void main(String arg[]) {
        Problem6GetMinimumWithOptimized stack = new Problem6GetMinimumWithOptimized();
        stack.push(12);
        stack.push(2);
        stack.push(10);
        stack.push(4);
        System.out.println(stack.getMinimum());
    }

    public void push(int item) {
        first1 = new Node(item, first1);
        if (size() == 0) {
            first2 = new Node(item, first2);
        } else {
            if (first2.item == first1.item || first2.item > first1.item) {
                first2 = new Node(first1.item, first2);
            }
        }
        size++;
    }

    public int pop() {
        int temp = first1.item;
        if (first1.item == first2.item)
            first2 = first2.next;
        first1 = first1.next;

        size--;
        return temp;
    }

    public int size() {
        return size;
    }

    public int getMinimum() {
        return first2.item;
    }

    private class Node {
        int item;
        Node next;

        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

}
