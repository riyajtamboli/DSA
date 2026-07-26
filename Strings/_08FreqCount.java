package Strings;

import java.util.HashMap;

public class _08FreqCount {
    void main(){
        String str = "aabbc";
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            hm.put(str.charAt(i), 
            hm.getOrDefault(str.charAt(i), 
            hm.getOrDefault(str.charAt(i), 0))+1);
        }
        System.out.println(hm);
    }
}
