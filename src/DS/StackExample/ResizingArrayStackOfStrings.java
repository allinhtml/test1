package DS.StackExample;

/**
 * Created by prvikani on 6/21/2016.
 */
public class ResizingArrayStackOfStrings {

    private String[] stack;
    private int N = 0;

    public ResizingArrayStackOfStrings() {
        stack = new String[1];
    }

    public static void main(String a[]) {
        ResizingArrayStackOfStrings s = new ResizingArrayStackOfStrings();
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
        if (stack.length == N) {
            resize(2 * stack.length);
        }
        stack[N++] = item;
    }

    public void resize(int capacity) {
        System.out.print("Resize :" + capacity);
        String[] newStack = new String[capacity];
        for (int i = 0; i < N; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    public String pop() {
        /* Assign null when it is no longer needed. */
        String temp = stack[--N];
        stack[N] = null;
        if (N > 0 && N == stack.length / 4) resize(stack.length / 2);
        return temp;
    }

    public int size() {
        return N;
    }
}
