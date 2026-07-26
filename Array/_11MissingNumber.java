package Array;

public class _11MissingNumber {
    void main(){
        int arr[] = {1,2,3,5};
        int n = arr.length+1;

        int actualSum = (n * (n+1)) / 2;
        int sum = 0;
        
        for(int i : arr){
            sum += i;
        }

        System.out.println("Missing Num :"+(actualSum - sum));
    
       
    }
}
