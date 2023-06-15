package Bitonic_Array;

import java.util.Arrays;

// T(n) = O(log n)
// s(n) = O(1)
public class BitonicArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 14, 20, 18, 12, 5};
        int key = 12;

        int i = bitonicNum(arr, 0, arr.length - 1);

        int ans = searchBitonic(arr, key, i, 0, arr.length - 1);

        if(arr[ans] == key){
            System.out.print("It contains number");
        }else{
            System.out.print("It does not contains number");
        }

    }

    static int descendingBinarySearch(int arr[], int low, int high, int key)
    {
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key)
            {
                return mid;
            }
            if (arr[mid] < key)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }

    static int ascendingBinarySearch(int arr[], int low, int high, int key)
    {
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key)
            {
                return mid;
            }
            if (arr[mid] > key)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }

    private static int searchBitonic(int[] arr,int key, int bit, int l, int r) {

        if(key > arr[bit]){
            return -1;
        }
        else if(key == arr[bit]){
            return bit;
        }
        else{
            int temp = ascendingBinarySearch(arr, l, bit-1, key);
            if(temp != -1) {
                return temp;
            }
        }
        return descendingBinarySearch(arr, bit + 1, r, key);
    }

    private static int bitonicNum(int[] arr, int l, int r) {
        int bitnoic = 0;
        int mid;

        mid = (l + r) / 2;

        if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
            return mid;
        } else {
            if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                bitnoic = bitonicNum(arr, mid, r);
            } else {
                if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    bitnoic = bitonicNum(arr, l, mid);
                }
            }
        }

        return bitnoic;
    }
}
