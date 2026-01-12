package Array_Practice;

import java.util.HashSet;

public class FirstDuplicateInArrays {

	public static void main(String[] args) {
		Integer arr[]  = {1,2,3,9,4,5,9,7};
		
		HashSet<Integer> hm = new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			if(hm.contains(arr[i])) {
				IO.println(arr[i]);
				break;
			}else {
				hm.add(arr[i]);
			}
		}

	}

}
