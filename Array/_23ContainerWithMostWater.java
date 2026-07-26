package Array;

public class _23ContainerWithMostWater {
    void main(){
        int arr[] = {1,8,6,2,5,4,8,3,7};
        int lp = 0, rp = arr.length-1;
        int maxWater = 0;
        while(lp < rp){
            int width = rp - lp;
            int ht = Math.min(arr[lp], arr[rp]);
            maxWater = Math.max(maxWater, (width * ht));
            
           if (arr[lp] < arr[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        System.out.println(maxWater);
    }
}
