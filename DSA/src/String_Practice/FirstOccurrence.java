package String_Practice;

public class FirstOccurrence {

    public static void main(String[] args) {
        String str = "java developer";
        char target = 'a';

        firstOccurrence(str, target);
    }

    public static void firstOccurrence(String str, char target) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                IO.print("First occurrence index: " + i);
                return;
            }
        }

        IO.print("Character not found");
    }
}
