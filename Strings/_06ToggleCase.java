package Strings;

public class _06ToggleCase {
    void main(){
        String str = "jAVa";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                System.out.print((char) (ch - 32));
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.print((char) (ch + 32));
            }
        }
       
    }
}
