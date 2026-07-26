package Array;

import java.util.HashSet;

public class _12RemoveDuplicates {
    void main(){

        int arr[] = {1,1,2,2,3};
        HashSet<Integer> hs = new HashSet<>();
    
        for(int i=0; i<arr.length; i++){
           hs.add(arr[i]);
        }

        System.out.println(hs);
    }
}
