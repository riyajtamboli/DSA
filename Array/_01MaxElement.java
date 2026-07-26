package Array;
class _01MaxElement {
    void main() {
        int arr[] = { 10, 45, 23, 89, 12 };

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max Element : " + max);
    }
}