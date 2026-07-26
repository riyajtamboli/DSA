package Strings;

public class _11ShortedWord {
    void main(){
        String str = "Java is powerful";
        String[] words = str.split(" ");
        String result = words[0];

        for(String word : words){
            if(word.length() <= result.length()){
                    result = word;
            }
        }

        System.out.println(result);
    }
}
