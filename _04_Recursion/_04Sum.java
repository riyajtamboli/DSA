package _04_Recursion;

public class _04Sum {
    void main(){
        System.out.println(sum(10));
    }

    int sum(int n){
        if(n == 1){
            return n;
        }
        
        return n + sum(n - 1);
    }
}
