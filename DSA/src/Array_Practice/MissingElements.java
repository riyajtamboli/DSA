package Array_Practice;


public class MissingElements{

    public static void main(String[] args) {

    	int arr[] = {1};
    	int expectedSum = ((arr.length+1)*(arr.length+2))/2;
    	int actualSum = 0;
    	for(int n : arr) {
    		actualSum = n+actualSum;
    	}
    	
    	IO.println(expectedSum-actualSum);
    }
}
