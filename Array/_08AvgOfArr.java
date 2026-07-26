package Array;

public class _08AvgOfArr {
    void main(){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int n  = arr.length;
        int sum = 0;
        for(int i : arr){
            sum = sum + i;
        }
        System.out.println("Avg of Arr : "+(sum / n));
    }
}
