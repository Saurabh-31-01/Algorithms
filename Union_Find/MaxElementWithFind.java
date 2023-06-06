package Union_Find;

public class MaxElementWithFind {
    private int id[];
    private int sz[];

    public MaxElementWithFind(int N){
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

        int max = 0;
        for(int j = 0; j < id.length; j++){
            if(id[j] == i) {
                if(max < j){
                    max = j;
                }
            }
        }

        return max;
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
}
