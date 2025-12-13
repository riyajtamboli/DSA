package Array_Practice;

public class EvenNumberInArray {
	
	public static int evenInArray(int arr[]) {
		int count=0;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]%2==0) {
				IO.print(arr[i]+" ");
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		int arr[]= {10,11,17,21,44,8,99,26};
			
			IO.println("\nTotal even in array : "+evenInArray(arr));
	}

}
