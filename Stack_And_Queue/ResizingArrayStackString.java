package Stack_And_Queue;

public class ResizingArrayStackString {

    private String[] s;
    private int top = -1;

    public ResizingArrayStackString(){
        s = new String[1];
    }

    public void resize(int capacity){
        String[] copy = new String[capacity];

        for(int i = 0; i <= top; i++){
            copy[i] = s[i];
        }

        s = copy;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(String str){
        if(top == s.length - 1){
            resize(2 * s.length);
        }

        s[++top] = str;
    }

    public String pop(){
        String p = s[top];
        s[top] = null;
        top--;

        if(top > -1 && top == s.length / 4){
            resize(s.length / 2);
        }

        return p;
    }

    public String peek(){
        return s[top];
    }

    public static void main(String args[]){
        ResizingArrayStackString ra = new ResizingArrayStackString();
        ra.push("hello");
        System.out.println(ra.s.length);

        System.out.println(ra.peek());

        ra.push("to");
        System.out.println(ra.s.length);
        ra.push("be");

        ra.pop();
        System.out.println(ra.s.length);

    }
}
