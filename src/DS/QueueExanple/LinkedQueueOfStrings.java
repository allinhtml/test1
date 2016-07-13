package DS.QueueExanple;

/**
 * Created by prvikani on 6/23/2016.
 */
public class LinkedQueueOfStrings {

    private Node first, last;
    private int size = 0;

    public static void main(String arg[]) {
        LinkedQueueOfStrings queue = new LinkedQueueOfStrings();
        queue.enqueue("Parth");
        queue.enqueue("Goguram");
        System.out.println(queue.dequeue());
        System.out.print(queue.dequeue());
    }

    public void enqueue(String item) {
        Node oldNode = last;
        last = new Node(item, null);
        size++;
        if (isEmpty())
            first = last;
        else
            oldNode.next = last;
    }

    public String dequeue() {
        String item = first.item;
        first = first.next;
        size--;
        if (isEmpty()) last = null;
        return item;
    }

    public boolean isEmpty() {
        return first == null;
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
