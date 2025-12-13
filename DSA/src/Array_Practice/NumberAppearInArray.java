package Array_Practice;

public class NumberAppearInArray {
	public static int numberAppear(int arr[], int key) {
		int count = 0;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]==key) {
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {10,20,10,55,17,81,10, 55};
		IO.print("Enter number to find count : ");
		int key = Integer.parseInt(IO.readln());
		IO.print("Number Appear in array : "+numberAppear(arr, key)+" Times");
	}

}
