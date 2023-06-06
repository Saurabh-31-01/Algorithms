package Union_Find;

import java.util.Arrays;

public class QuickFind {
    private int[] id;

    public QuickFind(int N){
        id = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    public boolean isConnected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];

        for(int i = 0; i < id.length; i++){
            if(id[i] ==  pid){
                id[i] = qid;
            }
        }
    }

    public static void main(String[] args) {
        QuickFind q = new QuickFind(10);

        System.out.print(Arrays.toString(q.id));
        System.out.println();

        boolean a = q.isConnected(4,5);
        System.out.print(a);
        System.out.println();

        q.union(0, 5);
        q.union(5,6);
        q.union(1, 2);
        q.union(2, 7);
        q.union(8,3);
        q.union(3, 4);
        q.union(4,9);

        System.out.println(q.isConnected(0, 6));
        System.out.println(q.isConnected(8, 9));
        System.out.println(q.isConnected(0, 9));
    }
}
