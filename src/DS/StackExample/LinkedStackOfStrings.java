package DS.StackExample;

public class LinkedStackOfStrings {

    private Node first = null;
    private int size = 0;

    public static void main(String arg[]) {
        LinkedStackOfStrings stack = new LinkedStackOfStrings();
        stack.push("Parth");
        System.out.println(stack.size());
        stack.push("Vikani");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String item) {
        first = new Node(item, first);
        size++;
    }

    public String pop() {
        String item = first.item;
        first = first.next;
        size--;
        return item;
    }

    public int size() {
        return size;
    }

    private class Node {
        String item;
        Node next;

        public Node(String item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}
