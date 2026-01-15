package Array_Practice;

import java.util.ArrayList;

public class NextGreaterElement {

	public static void main(String[] args) {
		
			int arr[]= {16, 17,4,3,5,2}; 
			NextGreatest(arr);
	}
	
	public static void NextGreatest(int arr[]) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=1; i<arr.length; i++) {
			int max = Integer.MIN_VALUE;
			if(arr[i]> max) {
				al.add(arr[i]);
			}else {
				al.add(-1);
			}
		}
		
		IO.print(al);
	}

}
