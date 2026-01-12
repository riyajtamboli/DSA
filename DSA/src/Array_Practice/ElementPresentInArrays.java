package Array_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ElementPresentInArrays {

	public static void main(String[] args) {
		Integer arr1[] = {1,2,3,9,8,7};
		Integer arr2[] = {4,1,2,10,15};
		Integer arr3[] = {5,1,2,4,10};
		
		HashSet<Integer> hs = new HashSet<>();
		ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(arr1));
		ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(arr2));
		ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(arr3));

		hs.addAll(l1);
		hs.addAll(l2);
		hs.addAll(l3);
		
		ArrayList<Integer> finalList = new ArrayList<>();
		
		for(Integer number : hs) {
			
			if((l1.contains(number) && l2.contains(number))||
			(l1.contains(number) && l3.contains(number))||
		(l2.contains(number) && l3.contains(number))){
				finalList.add(number);
			}
		}
		
		System.out.print(finalList);

	}

}
