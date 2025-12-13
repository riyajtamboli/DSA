package Array_Practice;

public class UniqueElementOnly {
	
	public static void print(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			int count = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count == 1) {
				IO.print(arr[i]+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 3, 5,7};
		print(arr);

	}

}
