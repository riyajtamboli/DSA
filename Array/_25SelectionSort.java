package Array;

import java.util.Arrays;

public class _25SelectionSort {
    void main(){
        int arr[] = {5, 1, 4, 2, 8};

        for(int i=0; i<arr.length; i++){
            int smallest = i ;

            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
