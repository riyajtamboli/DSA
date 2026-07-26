package Array;

public class _09EvenAndOdd {
    void main(){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int evenCount = 0 , oddCount = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Even is : "+evenCount + " And Odd is : "+oddCount);
    }
}
