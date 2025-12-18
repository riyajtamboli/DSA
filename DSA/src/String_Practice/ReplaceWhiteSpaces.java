package String_Practice;

public class ReplaceWhiteSpaces {
	
	public static void replaceWhiteSpaces(StringBuilder s, String str, char ch) {
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
				if(c != ' ') {
					s.append(c);
				}else {
					s.append(ch);
				}
			
		}
		IO.println(s);
	}
	public static void main(String[] args) {
		
		String str = "Riyaj Tamboli";
		
		char ch = '$';
		StringBuilder s = new StringBuilder();
		
		replaceWhiteSpaces(s,str, ch);

	}

}
