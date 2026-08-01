package _07DivideAndConq;

public class _02BinarySearch {
    void main(){
        int arr[] = {1,2,3,4,5,6};
        System.out.println(binarySeach(arr, 4, 0, arr.length-1));
    }

    public static int binarySeach(int arr[], int key, int start, int end){
       

        while(start<=end){
            int mid = start + (end - start) /2;

            if(arr[mid] == key){
                return mid;
            }else if(key >arr[mid]){
                    start = mid +1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
}
