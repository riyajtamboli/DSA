package Array;

import java.util.Arrays;

public class _15RotateByK {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int k = 2;

        k = k % arr.length;

        rotate(0, k - 1, arr);
        rotate(k, arr.length - 1, arr);
        rotate(0, arr.length - 1, arr);

        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int start, int end, int arr[]) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}