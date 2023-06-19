package Stack_And_Queue;

public class LinkedQueueString {

    private Node first, last;

    private class Node{
        String item;
        Node next;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void enqueue(String s){

        Node oldLast = last;
        last = new Node();
        last.item = s;
        last.next = null;
        if(isEmpty()){ first = last; }
        else{ oldLast.next = last; }
    }

    public String dequeue(){
        if(!isEmpty()){
            String s = first.item;
            first = first.next;
            return s;
        }else{
            last = null;
        }

        return "queue is Empty";
    }


    public static void main(String args[]){
        LinkedQueueString ls = new LinkedQueueString();
        ls.enqueue("to");
        ls.enqueue("be");
        ls.enqueue("me");

        System.out.println(ls.first.item);
        ls.dequeue();

        System.out.println(ls.first.item);
        ls.dequeue();

        System.out.println(ls.first.item);
        ls.dequeue();
    }
}
