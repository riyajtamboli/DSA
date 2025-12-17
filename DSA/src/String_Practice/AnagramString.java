package String_Practice;

import java.util.HashMap;

public class AnagramString {
	public static void angramString(HashMap<Character, Integer> hm, String str1, String str2) {
		for(int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		
		
		for(int i=0; i<str2.length(); i++) {
			char ch = str2.charAt(i);
			if(hm.get(ch)!= null) {
					if(hm.get(ch)==1) {
						hm.remove(ch);
					}else {
						hm.put(ch, hm.get(ch)-1);
					}
				}else {
					IO.print("String are not");
				}
				}
				
				if(hm.isEmpty()) {
					IO.println("String are anagram..........");
				}
				
				IO.print(hm);
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hm = new HashMap<>();
			String str1= "mace";
			String str2 = "care";
			
			angramString(hm, str1, str2);
	}

}
