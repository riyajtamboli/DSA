package _08Backtracking;

import java.util.Arrays;

public class _01ChangeValue {

   public static void changeValue(int arr[], int index, int value){
            if(index == arr.length){
                System.out.println(Arrays.toString(arr));
                return;
            }
            arr[index] = value;
            changeValue(arr, index+1, value+1);
            arr[index] = value - 2;
    }
    void main(){
        int arr[] = new int[5];
        changeValue(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}
