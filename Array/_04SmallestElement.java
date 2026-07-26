package Array;

public class _04SmallestElement {
    void main() {
        int arr[] = { 10, 45, 5, 2, 23, 89, 12 };

        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element : "+smallest);
    }
}
