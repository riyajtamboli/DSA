package _09Stack;
import java.util.Arrays;
import java.util.Stack;
public class _01NextGreater{

    void main(){
        int arr[] = {6,8,0,1,3};
    
        int newArr[] = new int[arr.length];
        Stack<Integer> sk = new Stack<>();
        for(int i= arr.length-1; i>=0; i--){
            while(!sk.isEmpty() && arr[i] >= arr[sk.peek()]){
                sk.pop();
            }

            if(sk.isEmpty()){
                newArr[i] = -1;
            }else{
                newArr[i] = arr[sk.peek()];
            }
    
            sk.push(i);
        }
    
        System.out.println(Arrays.toString(newArr));
    }
}