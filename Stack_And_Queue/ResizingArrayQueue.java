package Stack_And_Queue;

import java.util.ArrayList;

public class ResizingArrayQueue {
    private ArrayList<Integer> arr = new ArrayList<>();

    public boolean isEmpty(){
        return arr.size() == 0;
    }

    public void offer(int data){
        arr.add(data);
    }

    public int poll(){
        return arr.remove(0);
    }

    public static void main(String[] args) {
        ResizingArrayQueue raq = new ResizingArrayQueue();
        raq.offer(10);
        raq.offer(11);
        raq.offer(12);
        raq.offer(13);

        while (!raq.isEmpty()){
            System.out.println(raq.poll());
        }
    }
}
