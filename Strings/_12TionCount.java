package Strings;

public class _12TionCount {
    void main(){
        String str = "i got information please fill the application";
        String[] s = str.split(" ");

        String ans = "tion";
        int count = 0;
        for(String s2 : s){
            if(s2.contains(ans)){
                count++;
            }
        }

        System.out.println(count);
    }
}
