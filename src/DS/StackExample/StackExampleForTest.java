package DS.StackExample;

import java.util.Iterator;

/**
 * Created by prvikani on 7/13/2016.
 */
public class StackExampleForTest<Item> implements Iterable<Item> {

    private class Node{
        Item item;
        Node next;

        public Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node first = null;
    private int size = 0;

    public boolean isEmpty(){
        return  first == null;
    }

    public int size(){
        return size;
    }

    public void push(Item item){
        first = new Node(item, first);
        size++;
    }

    public Item pop(){
        Item temp = first.item;
        first.item = null;
        first = first.next;
        size--;
        return temp;
    }

    public Iterator<Item> iterator(){
        return new Iterator<Item>() {
            Node temp = first;
            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public Item next() {
                Item tempItem = temp.item;
                temp = temp.next;
                return tempItem;
            }
        };
    }

    public static void main(String args[]){
        StackExampleForTest<String> stack = new StackExampleForTest<>();
        stack.push("Nirali");
        stack.push("Parth");
        System.out.println(stack.pop());
        stack.push("Nirali");
        stack.push("Parth");
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
