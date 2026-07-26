package Array;

public class _19StockBuySell {
    void main(){
        int arr[] ={7,1,5,6,4};
        int bp = arr[0];
        int p = 0;
        for(int i=0; i<arr.length; i++){
            bp = Math.min(arr[i], bp);
            int sp = arr[i];
            int profit = sp - bp;
            p = Math.max(profit, p);
        }

        System.out.println(p);
    }
}
