package Bitonic_Array;

public class BinarySearchAlgo{

    public int binarySearch(int arr[], int p, int q, int key){
        int mid;
        while (p <= q){
            mid = q + (p - q) / 2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] > key){
                q = mid - 1;
            }else{
                p = mid + 1;
            }
        }
        return -1;
    }

    public int descBinarySearch(int arr[], int p, int q, int key){
        int mid;
        while (p <= q){
            mid = q + (p - q) / 2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] < key){
                q = mid - 1;
            }else{
                p = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 8, 9};

        BinarySearchAlgo k = new BinarySearchAlgo();
        int ans = k.binarySearch(arr, 0, arr.length-1, 6);

        if(ans != -1){
            System.out.println(arr[ans]);
        }

        int a[] = {10, 9, 8, 4, 2, 1};
        int val = k.descBinarySearch(a, 0, a.length - 1, 8);

        if(val != -1){
            System.out.print(a[val]);
        }
    }
}
