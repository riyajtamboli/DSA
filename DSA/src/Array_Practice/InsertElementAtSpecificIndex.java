package Array_Practice;

public class InsertElementAtSpecificIndex {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        int index = 4;   
        int value = 5;
	
	        int[] result = insert(arr, index, value);
	
	        for (int x : result) {
	            IO.print(x + " ");
	        }
    }

    public static int[] insert(int[] arr, int index, int value) {

        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        newArr[index] = value;

        System.arraycopy(arr, index, newArr, index + 1, arr.length - index);

        return newArr;
    }
}
