package Union_Find;

import java.util.Arrays;

// WQUPC :- weighted Quick union path compression
public class WQUPC {

    private int id[];
    private int sz[];

    public WQUPC(int N){
        id = new int[N];
        sz = new int[N];

        for(int i = 0; i < N; i++){
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int root(int i){
        while(i != id[i]){

            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean isConnected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);

        if(i == j){
            return;
        }

        if(sz[i] < sz[j]){
            id[i] = j;
            sz[j] += sz[i];
        }else{
            id[j] = i;
            sz[i] += sz[j];
        }
    }

    public static void main(String[] args) {
        WQUPC wc = new WQUPC(10);

        wc.union(2, 4);
        wc.union(2, 3);
        wc.union(1, 2);
        wc.union(3, 5);
        wc.union(6, 9);
        wc.union(9, 8);
        wc.union(7, 8);

        System.out.print(wc.isConnected(4, 1));
        System.out.print(Arrays.toString(wc.sz));
    }
}
