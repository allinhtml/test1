package DS.StackExample;
import java.util.Iterator;

public class LinkedStack<Item> implements Iterable<Item> {

    private Node first = null;

    public static void main(String[] a) {
        LinkedStack<String> s = new LinkedStack<String>();
        s.push("Parth");
        //System.out.println(s.size());
        //System.out.println(s.size());
        s.push("Vikani");
        s.push("Parth");
        //System.out.println(s.pop());

        Iterator<String> itra = s.iterator();
        while (itra.hasNext()){
            System.out.println("Hi : "+itra.next());
        }
        System.out.println(s.size());
    }

    public Iterator<Item> iterator(){
        return new LinkedStackIterator();
    }

    private class LinkedStackIterator implements Iterator<Item>{

        private Node current = first;

        public boolean hasNext(){
            return current != null;
        }
        public void remove()    { /* Not supported now. */    }
        public Item next(){
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(Item item) {
        Node oldNode = first;
        first = new Node();
        first.item = item;
        first.next = oldNode;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        return item;
    }

    public int size() {
        int counter = 0;
        Node newNode = first;
        while (newNode != null) {
            counter++;
            newNode = newNode.next;
        }
        return counter;
    }

    private class Node {
        Item item;
        Node next;
    }
}