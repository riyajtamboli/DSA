package String_Practice;

public class CountVowels {

	public static void main(String[] args) {
		String str = "riyaj";
		
		int countVowel = 0;
		int countConsonent = 0;
		for(int i=0; i<=str.length()-1; i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z' ) {
				if(ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e') {
					countVowel++;
				}else {
					countConsonent++;
				}
			}
		}
			
		IO.println("Total Vowel In String : "+countVowel);
		IO.print("Total Consonent In String : "+countConsonent);
	}

}
