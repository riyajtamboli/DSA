package Array_Practice;

public class MaximumInArray {
		public static int maximumInArray(int arr[]) {
			int max = Integer.MIN_VALUE;
			for(int i=0; i<=arr.length-1; i++) {
				if(arr[i] > max) {
					max = arr[i];
				}
			}
			return max;
		}
}
