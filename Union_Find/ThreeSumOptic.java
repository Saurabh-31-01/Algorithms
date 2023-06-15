package Union_Find;

import java.util.Arrays;

// well this algorithm basically takes O(n^2) time
// and O(1) for space.
public class ThreeSumOptic {

    public int threeSum(int[] arr) {
        Arrays.sort(arr);

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            int l = i + 1;
            int r = arr.length - 1;
            int a = arr[i];

            while (l < r) {

                if (a + arr[l] + arr[r] == 0) {

                    System.out.println(a+" "+arr[l]+" "+arr[r]);
                    count++;
                    l++;
                    r--;

                }

                if (a + arr[l] + arr[r] < 0) {
                    l++;
                }

                if (a + arr[l] + arr[r] > 0) {
                    r--;
                }
            }
        }


        return count;
    }

    public static void main(String[] args) {

        int[] arr = {30, -40, -20, -10, 40, 0, 10, 5};

        ThreeSumOptic t = new ThreeSumOptic();
        System.out.print(t.threeSum(arr));

    }
}
