package DS.StackExample;

/**
 * Created by prvikani on 6/22/2016.
 */
public class Problem1BalencingBracket {

    private Node first = null;
    private int size = 0;

    public static void main(String arg[]) {
        String test = "((a+b)+[c-d]}";
        boolean flag = true;
        char[] testArray = test.toCharArray();
        Problem1BalencingBracket stack = new Problem1BalencingBracket();
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] == '(' || testArray[i] == '{' || testArray[i] == '[')
                stack.push(testArray[i]);
            if (testArray[i] == ')' || testArray[i] == '}' || testArray[i] == ']') {
                if (stack.isEmpty()) flag = false;
                else {
                    if (testArray[i] == ')' && '(' != stack.pop()) {
                        flag = false;
                        break;
                    }
                    if (testArray[i] == '}' && '{' != stack.pop()) {
                        flag = false;
                        break;
                    }
                    if (testArray[i] == ']' && '[' != stack.pop()) {
                        flag = false;
                        break;
                    }
                }
            }
        }

        if (!stack.isEmpty()) flag = false;
        if (flag == true)
            System.out.print("Yes");
        else
            System.out.print("No");
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(char item) {
        System.out.println("Pushed : " + item);
        first = new Node(item, first);
        size++;
    }

    public char pop() {
        System.out.println("Pop : " + first.item);
        size--;
        char c = first.item;
        first = first.next;
        return c;
    }

    public int size() {
        return size;
    }

    private class Node {
        char item;
        Node next;

        public Node(char item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
}