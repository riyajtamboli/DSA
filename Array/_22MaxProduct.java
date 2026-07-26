package Array;

public class _22MaxProduct {
    void main(){
        int arr [] = {2,3,-2,4};
        int product = arr[0];
        int maxProduct = arr[0];
        for(int i=1;  i<arr.length; i++){
            product = Math.max(arr[i], arr[i]*product);
            maxProduct = Math.max(product, maxProduct);
        }

        System.out.println(maxProduct);
    }
}
