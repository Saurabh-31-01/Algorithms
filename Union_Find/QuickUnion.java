package Union_Find;

import java.util.Arrays;

public class QuickUnion {

    private int[] id;

    public QuickUnion(int N){
        id = new int[N];

        for(int i = 0; i < N; i++)
            id[i] = i;
    }

    private int root(int j){
        while(j != id[j])
            j = id[j];

        return j;
    }

    public boolean isConnected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){

        int i = root(p);
        int j  = root(q);

        id[i] = j;
    }

    public static void main(String[] args){
        QuickUnion q = new QuickUnion(10);
        System.out.print(Arrays.toString(q.id));
        System.out.println();

        q.union(6,5);
        q.union(4, 3);
        q.union(2, 9);
        q.union(4, 9);

        System.out.println(q.root(3));

        System.out.println(q.isConnected(3, 9));
    }

}
