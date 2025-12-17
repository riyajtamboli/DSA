package String_Practice;
public class ReverseWordInString {

    public static String reverseEachWord(String str) {

        String result = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word = ch + word;   
            } else {
                result = result + word + " ";
                word = "";
            }
        }

        result = result + word;

        return result;
    }

    public static void main(String[] args) {

        String str = "Java is very easy";

        System.out.println(reverseEachWord(str));
    }
}
