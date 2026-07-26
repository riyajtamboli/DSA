package Array;

public class _27PeakElement {

    void main() {

        int arr[] = {1, 2, 3, 1};

        int n = arr.length;

        // Check first element
        if (n == 1 || arr[0] > arr[1]) {
            System.out.println("Peak Element: " + arr[0]);
            return;
        }

        // Check middle elements
        for (int i = 1; i < n - 1; i++) {

            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println("Peak Element: " + arr[i]);
                return;
            }
        }

        // Check last element
        if (arr[n - 1] > arr[n - 2]) {
            System.out.println("Peak Element: " + arr[n - 1]);
        }
    }
}