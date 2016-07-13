package DS.StackExample;

/**
 * Created by prvikani on 6/21/2016.
 */
public class FixedCapacityStackOfStrings {

    private String[] stack;
    private int N = 0;

    public FixedCapacityStackOfStrings(int capacity) {
        stack = new String[capacity];
    }

    public static void main(String a[]) {
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(10);
        s.push("Parth");
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());
        s.push("Vikani");
        s.push("Parth");
        System.out.println(s.size());
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(String item) {
        stack[N++] = item;
    }

    public String pop() {
        return stack[--N];
        /* Assign null when it is no longer needed.
        String temp = stack[--N];
        stack[N] = null;
        return temp; */
    }

    public int size() {
        return N;
    }
}
