package Union_Find;

/*Given a social network containing n members and a log file containing m timestamps
at which times pairs of members formed friendships, design an algorithm to determine the
earliest time at which all members are connected
(i.e., every member is a friend of a friend of a friend ... of a friend).
Assume that the log file is sorted by timestamp and that friendship is an equivalence relation.
The running time of your algorithm should be mlogn or better and use extra space proportional to n.*/

public class SocialNetwork {

    private int[] id;
    private int[] sz;

    public SocialNetwork(int N){
        id = new int[N];
        sz = new int[N];

        for(int i = 0; i < N; i++){
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int root(int r){

        while(r != id[r]){
            id[r] = id[id[r]];
            r = id[r];
        }

        return r;
    }

    public boolean isConnected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);

        if(i == j){
            return;
        }else{
            if(sz[i] < sz[j]){
                id[i] = j;
                sz[j] += sz[i];
            }
            else{
                id[j] = i;
                sz[i] += sz[j];
            }
        }
    }

    public int timeStamp(int[][] log){
        int track = id.length;

        for(int [] entry : log){
            int time = entry[0];
            int memberA = entry[1];
            int memberB = entry[2];

            if(!isConnected(memberA, memberB)){
                union(memberA,memberB);
                track--;
                if(track == 1){
                    return time;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int n = 6;
        int[][] log = {
                { 1, 1, 2 },
                { 2, 2, 3 },
                { 3, 4, 5 },
                { 4, 3, 4 },
                { 5, 1, 0 },
                { 6, 5, 0 }
        };

        SocialNetwork s = new SocialNetwork(n);
        int latestTimeStamp = s.timeStamp(log);

        if(latestTimeStamp != -1){
            System.out.print("earliest time at which all members are connected == "+latestTimeStamp);
        }else{
            System.out.print("All members cannot be connected");
        }
    }
}
