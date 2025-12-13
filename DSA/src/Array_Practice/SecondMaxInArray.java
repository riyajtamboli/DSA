package Array_Practice;

public class SecondMaxInArray {

    public static int secondLargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max2 = max;    // previous max becomes second max
                max = arr[i];  // update max
            } 
            else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];  // update second max
            }
        }

        return max2;
    }

    public static void main(String[] args) {
        int arr[] = { 15, 14, 81, 27, 31, 25 };
        IO.print(secondLargest(arr));
    }
}
