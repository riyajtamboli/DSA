package Strings;

import java.util.HashMap;
import java.util.Map;

public class _15Compression {
    void main(){
        String str = "aaabbcccc";
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character, Integer> e : hm.entrySet()){
            System.out.print(e.getKey()+""+e.getValue());
        }

    }
}
