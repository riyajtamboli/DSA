package _04_Recursion;

public class _05FibSeries {
    void main(){
        int n = 10;
        for(int i=0; i<=10; i++){
            System.out.print(fib(i)+" ");
        }
    }
     int fib(int n){
        if(n == 1 ||n == 0){
            return n;
        }
        return fib(n-1) + fib(n-2);
     }
}
