package DS.LinkedListExample;

import java.util.Iterator;

/**
 * Created by prvikani on 6/26/2016.
 */
public class Testing {
    public static void main(String arg[]){
        SinglyLinkedList<Integer> sl= new SinglyLinkedList<>();
        sl.addLast(30);
        sl.addFirst(1);
        Iterator<Integer> itr=sl.iterator();
        while (itr.hasNext()){
                System.out.println(itr.next());

        }
    }
}
