package Strings;

public class _14LongestWord {
    void main(){
        String str = "java is Programming langauge";
        String s[] = str.split(" ");

        String result = s[0];

        for(String s1 : s){
            if(result.length() < s1.length()){
                result = s1;
            }
        }

        System.out.println(result);
    }
}
