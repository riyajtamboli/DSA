package Strings;

import java.util.Stack;

public class _10Anagram {
    void main(){
        String s = "listen";
        String t = "silent";

        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            st.push(ch);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(st.contains(ch)){
                st.remove(Character.valueOf(ch));
            }
        }
        
        if(st.isEmpty()){
            IO.println("Anagram");
        }else{
            IO.println("Not Anagram");
        }
    }
}
