package Array_Practice;

public class IsSorted {
	public static boolean isSorted(int arr[], int i) {
		
		if(i==arr.length-1) {
			return true; 
		}
		if(arr[i]> arr[i+1]) {
			return false;
		}
		return isSorted(arr, i+1);
		
	}

	public static void main(String[] args) {
		int arr [] = {12, 15,22,35,88,99};
		IO.println(isSorted(arr, 0));
	}

}
