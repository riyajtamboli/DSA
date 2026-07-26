package Array;

public class _05SecondMax {
    void main(){
         int arr[] = { 10, 45, 5, 2, 23, 89, 12 };
        
         int firstMax = Integer.MIN_VALUE;
         int secondMax = Integer.MIN_VALUE;

         for(int i=0; i<arr.length; i++){
            if(arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }else if(arr[i]> secondMax && firstMax != secondMax){
                secondMax = arr[i];
            }
         }

         System.out.println("Sexond Max : "+secondMax);
    }
}
