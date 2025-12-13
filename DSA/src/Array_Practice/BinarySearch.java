package Array_Practice;

public class BinarySearch {
	public static int binarySearch(int arr[], int key) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = (start+end)/2;
			if(arr[mid]==key) {
				return mid;
			}
			
			if(key > arr[mid]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {10, 15, 27, 35, 55,88};
		
		IO.print("Enter key to search : ");
		int key = Integer.parseInt(IO.readln());
		int index = binarySearch(arr, key);
		if(index == -1) {
			IO.print("Key is not found");
		}else {
			IO.print("Key is found at : "+index);
		}
	}

}
