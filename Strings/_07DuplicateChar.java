package Strings;

import java.util.HashSet;

public class _07DuplicateChar {
    void main(){
        String str = "programming";
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<str.length(); i++){
            if(!hs.add(str.charAt(i))){
                IO.print(str.charAt(i)+" ");
            }
        }

    }
}
