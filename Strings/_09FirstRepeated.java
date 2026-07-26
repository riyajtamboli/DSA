package Strings;

import java.util.HashSet;

public class _09FirstRepeated {
    void main(){
        String str = "swiss";

        HashSet<Character> hs = new HashSet<>();

        for(int i=0; i<str.length(); i++){
            if(hs.contains(str.charAt(i))){
                IO.print(str.charAt(i));
                return;
            }

            hs.add(str.charAt(i));
        }
    }
}
