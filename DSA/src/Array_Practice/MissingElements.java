package Array_Practice;
import java.util.HashSet;

public class MissingElements{

    public static void main(String[] args) {

        int arr[] = {1,2,3,5,6};

        HashSet<Integer> set = new HashSet<>();

        int min = arr[0];
        int max = arr[0];

        for (int n : arr) {
            set.add(n);
            if (n < min) min = n;
            if (n > max) max = n;
        }

        System.out.print("Missing numbers: ");
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
