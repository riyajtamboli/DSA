package Strings;

public class _13ReverseEachWord {
    void main(){
        String str = "Riyaj Tamboli";

        String s [] = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s1 : s){
            for(int i=s1.length()-1; i>=0; i--){
                char ch = s1.charAt(i);
                sb.append(ch);
            }
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
