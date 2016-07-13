package DS.LinkedListExample;

/**
 * Created by prvikani on 6/30/2016.
 */
public class ReverseLinkedListWithoutRecursion {

    private Node first = null, last = null;
    private int size = 0;

    private class Node{
        int item;
        Node next;

        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private void addFirst(int item){
        first = new Node(item, first);
        if (last == null)
            last = first;
        size++;
    }

    private void addLast(int item){
        Node oldLast = last;
        last = new Node(item, null);
        if (oldLast != null)
            oldLast.next = last;
        if (first == null)
            first = last;
        size++;
    }


    public void add(int index, int element) {
        checkPositionIndex(index);

        if (index == 0)
            addFirst(element);
        else if(index == size)
            addLast(element);
        else
            addBefore(element, node(index));
    }

    private void addBefore(int item, Node next){

    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private boolean isPositionIndex(int index) {
        return index >= 1 && index <= size;
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    private Node node(int index){
        Node current = first;
        while (index > 0){
            current = current.next;
            index--;
        }
        return current;
    }

    private int size(){
        return size;
    }
}
