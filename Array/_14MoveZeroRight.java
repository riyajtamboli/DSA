package Array;

import java.util.Arrays;

public class _14MoveZeroRight {
    void main(){
        int arr[] = {0,1,0,3,12};
        int temp [] = new int [arr.length];
        int j = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(temp));
    }
}
