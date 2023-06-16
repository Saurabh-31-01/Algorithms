package Stack_And_Queue;

public class FixedCapacityStackOfStrings {
    private String[] s;
    private int top = -1;

    public FixedCapacityStackOfStrings(int capacity) {
        s = new String[capacity];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(String str) {
        s[++top] = str;
    }

    public String pop() {
        String s1 = s[top];
        s[top] = null;
        top--;
        return s1;
    }

    public String peek() {
        return s[top];
    }

    public static void main(String args[]) {
        FixedCapacityStackOfStrings fc = new FixedCapacityStackOfStrings(10);
        fc.push("hello");
        fc.push("to");

        System.out.println(fc.peek());
        fc.pop();
        System.out.println(fc.peek());
        fc.pop();
        fc.push("ok");
        System.out.println(fc.isEmpty());
    }
}
