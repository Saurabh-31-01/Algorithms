package Stack_And_Queue;

public class LinkedStackStrings<E>{
    private Node head = null;

    private class Node{
        String item;
        Node next;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void push(String val){
        Node oldHead = head;

        head = new Node();
        head.item = val;
        head.next = oldHead;

    }

    public String pop(){
        String s = head.item;
        head = head.next;
        return s;
    }

    public String peek(){
        if(head == null){
            return "Stack is Empty";
        }
        return head.item;
    }

    public static void main(String args[]){
        LinkedStackStrings<String> s = new LinkedStackStrings<>();
        s.push("to");
        s.pop();
        System.out.println(s.peek());
        s.push("be");
        s.push("ok");
        s.pop();
        System.out.println(s.peek());
    }
}
