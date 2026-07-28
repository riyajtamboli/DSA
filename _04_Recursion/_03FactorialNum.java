package _04_Recursion;

public class _03FactorialNum {
    void main(){
        System.out.println(fact(5));
    }

    int fact(int n){

        if(n == 1 || n == 0){
            return 1;
        }

        return n * fact(n - 1 );

    }
}
