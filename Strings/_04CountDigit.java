package Strings;

public class _04CountDigit {
    void main(){
        String str = "Hello123";

        int num = 0;
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                num++;
            }
        }

        IO.print(num);
    }
}
