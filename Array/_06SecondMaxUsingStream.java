package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class _06SecondMaxUsingStream {
    void main(){
        int arr[] = { 10, 45, 5, 2, 23, 89, 12 };

      Optional<Integer> secMax =  Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
      System.out.println(secMax);
    }
}
