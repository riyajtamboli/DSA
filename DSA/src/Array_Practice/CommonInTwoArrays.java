package Array_Practice;

import java.util.HashSet;

public class CommonInTwoArrays {

	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5};
		Integer arr2[]= {3,4,5,6,7};
		commonElement(arr, arr2);
		
	}
	
	public static void commonElement(Integer arr[], Integer arr2[]) {
				HashSet<Integer> hs = new HashSet<>();
					
				for(Integer e : arr) {
					hs.add(e);
				}
			
				for(Integer el : arr2) {
					if(hs.contains(el)) {
						IO.print(el+" ");
					}
				}
		}
}
