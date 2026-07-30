package Array;

public class _30ThirdMax {
    void main(){
        int arr [] = {1,3,4,5,7,8,9};
        int firstMax= Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            }else if(arr[i] > secondMax && arr[i] != firstMax && arr[i] != secondMax){
                thirdMax = arr[i];
            }
        }

        System.out.println(thirdMax);
    }
}
