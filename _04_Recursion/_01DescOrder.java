package _04_Recursion;

public class _01DescOrder {
    void main(){
        print(10);
    }

   public int print( int n){
        if(n == 1){
            System.out.print(n);
            return n;
        }
        System.out.print(n +" ");

        return print(n-1);
    }
}
