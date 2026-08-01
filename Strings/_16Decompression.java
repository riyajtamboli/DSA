package Strings;

public class _16Decompression {

    public static void main(String[] args) {

        String str = "a3b2c4";

        StringBuilder sb = new StringBuilder();

        char result = ' ';

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {

                int count = ch - '0';

                for (int j = 0; j < count; j++) {
                    sb.append(result); 
                }

            } else {
                result = ch;
            }
        }

        System.out.println(sb);
    }
}