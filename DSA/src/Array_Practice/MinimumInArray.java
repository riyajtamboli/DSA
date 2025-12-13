package Array_Practice;

public class MinimumInArray {
		public static int minimumInArray(int arr[]) {
			int min = Integer.MAX_VALUE;
			for(int i=0; i<=arr.length-1; i++) {
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			return min;
		}
}
