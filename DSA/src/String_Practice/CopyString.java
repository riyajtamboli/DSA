package String_Practice;

public class CopyString {

	public static void main(String[] args) {
		String str = "Riyaj";
		String  str2 = " ";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			str2 = str2 + ch;
		}
		
		IO.print(str2);
	}

}
