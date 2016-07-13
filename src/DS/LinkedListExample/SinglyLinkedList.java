package DS.LinkedListExample;

import java.util.Iterator;

/**
 * Created by prvikani on 6/26/2016.
 */
public class SinglyLinkedList<E> implements Iterable<E> {

    private Node<E> first = null, last = null;
    private int size = 0;

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    public void addFirst(E e) {
        first = new Node<>(e, first);
        if (last == null)
            last = first;
        size++;
    }


    public void addLast(E e) {
        Node<E> newNode = new Node<>(e, null);
        if(last!= null)
            last.next = newNode;
        last = newNode;
        if (first == null)
            first = last;
        size++;
    }

    void linkBefore(E e, Node<E> prev) {
        final Node<E> nextNode = prev.next;
        final Node<E> newNode = new Node<>(e, nextNode);
        prev.next = newNode;
        size++;
    }

    public void addBefore(int index, E element) {
        checkPositionIndex(index);
        if (index == 1)
            addFirst(element);
        else
            linkBefore(element, node(index));
    }

    Node<E> node(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;
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

    public void print(){
        Node<E> temp = first;
        while (temp!= null){
            System.out.println(temp.item);
            temp= temp.next;
        }
    }

    public Iterator<E> iterator(){
        return new Iterator<E>() {
            Node<E> temp=first;

            @Override
            public boolean hasNext() {
                return temp!= null;
            }

            @Override
            public E next() {
                E item=temp.item;
                temp=temp.next;
                return item;
            }
        };
    }


}
