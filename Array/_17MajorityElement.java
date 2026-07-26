package Array;

import java.util.HashMap;
import java.util.Map;

public class _17MajorityElement {
    void main(){
        int arr[] = {3, 2, 3};
        int n = arr.length;
        int total = n / 2;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            if(e.getValue()> total){
                System.out.println(e.getKey());
            }
        }
    }

}
