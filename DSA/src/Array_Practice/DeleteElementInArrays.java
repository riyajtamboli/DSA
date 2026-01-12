package Array_Practice;

import java.util.HashSet;

import java.util.Scanner;

public class DeleteElementInArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		HashSet <Integer>hs = new HashSet<>();
		System.out.print("Enter elemet to delete : ");
		int el = sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			hs.add(arr[i]);
			if(hs.contains(el)) {
				hs.remove(el);
			}
		}
	
		
		System.out.print(hs);

	}

}
