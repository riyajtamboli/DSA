package Array_Practice;

public class ReverseArray {
	
	public static void reverseArray(int arr[]) {
		for(int i= arr.length-1; i>=0; i--) {
			IO.print(arr[i]+" ");
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {10,20,55,70,101,22};
		reverseArray(arr);
	}

}
