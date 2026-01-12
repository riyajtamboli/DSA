package Array_Practice;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arrays: ");
		int size = sc.nextInt();
		int arr [] = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter element in add arrays : "+i);
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	

}
