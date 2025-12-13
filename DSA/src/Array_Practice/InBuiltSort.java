package Array_Practice;

import java.util.Arrays;

public class InBuiltSort {

	public static void main(String[] args) {
			int arr[] = {35, 1, 15, 9, 66, 21, 99, 88};
			Arrays.sort(arr);
			for(int i=0; i<arr.length; i++) {
				IO.print(arr[i]+" ");
			}
	}

}
