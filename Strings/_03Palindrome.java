package Strings;

public class _03Palindrome {
    void main(){
        String str = "madam";
        StringBuilder sb = new StringBuilder();

        for(int i=str.length()-1; i>=0 ; i--){
                sb.append(str.charAt(i));
        }

        if(sb.toString().equals(str)){
            IO.println("Palindrome");
        }else{
            IO.println("Not Palindrome");
        }
    }
}
