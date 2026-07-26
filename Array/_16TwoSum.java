package Array;

import java.util.HashMap;

public class _16TwoSum {
    void main(){
        int arr [] = {2,7,11,15};
        HashMap<Integer, Integer> hm = new HashMap<>();
        int target = 9;
        for(int i= 0; i<arr.length; i++){
            int complement = target - arr[i];
            if(hm.containsKey(complement)){

                IO.println(hm.get(complement)+ ", "+ i);
            }

            hm.put(arr[i], i);
        }
    }
}
