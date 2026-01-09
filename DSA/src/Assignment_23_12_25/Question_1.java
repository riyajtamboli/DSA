package Assignment_23_12_25;

public class Question_1 {

	public static void main(String[] args) {
		int number = 1;
		String letter = "abc";
		number = numbers(number);
		letters(letter);
		System.out.print(number + letter);
	}
		public static int numbers(int number) {
			number++;
			return number;
		}
		
		public static String letters(String letter) {
			letter += "d";
			return letter;
		}

}
