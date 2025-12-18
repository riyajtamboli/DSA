package String_Practice;

public class StringLengthWithoutLength {

	public static void main(String[] args) {
		
		String str = "Riyaj Tamboli";
		int count=0;
		for (char ch : str.toCharArray()){
			
				count++;
		
	}
		IO.print("Length Of String : "+count);
	}
}