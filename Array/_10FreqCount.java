package Array;

import java.util.HashMap;

public class _10FreqCount {
    void main(){
        int arr [] = {10, 20, 10, 30, 20, 10};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(hm);
    }
}
