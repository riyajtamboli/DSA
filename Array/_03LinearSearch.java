package Array;

public class _03LinearSearch {
    void main(){
        int arr[] = {5,12,7,18,25};
        int index = linearSearch(arr, 18);
        if(index != -1){
            System.out.println("Key found at index :"+index);
        }else{
            System.out.println("Key not available");
        }
    }

    public int linearSearch(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
                return i;
            }
        }

        return -1;
    }
}
