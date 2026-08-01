package _08Backtracking;

public class _03Permutation {

    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }

    public static void permutation(String str, String ans) {

        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Choose every character one by one
        for (int i = 0; i < str.length(); i++) {

            char curr = str.charAt(i);

            // Remove current character from string
            String newStr = str.substring(0, i) + str.substring(i + 1);

            // Recursive Call
            permutation(newStr, ans + curr);
        }
    }
}