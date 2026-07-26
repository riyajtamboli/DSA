/* An element is called a leader if it is 
greater than all the elements to its right. 
The last element is always a leader. */

package Array;

import java.util.ArrayList;
import java.util.Collections;

public class _21Leaders {

    void main() {

        int arr[] = { 16, 17, 4, 3, 5, 2 };

        ArrayList<Integer> al = new ArrayList<>();

        int max = arr[arr.length - 1];
        al.add(max);

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] >= max) {
                max = arr[i];
                al.add(arr[i]);
            }
        }

        Collections.reverse(al);

        System.out.println(al);
    }
}