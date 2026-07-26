package Array;

import java.util.Arrays;

public class _20Rearrange {
    void main(){
        int arr[] = {-1, 2, -3, 4};
        int temp [] = new int [arr.length];
        int pos = 0;
        int neg = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                temp[pos] = arr[i];
                pos = pos + 2;
            }else{
                temp[neg] = arr[i];
                neg = neg + 2;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
