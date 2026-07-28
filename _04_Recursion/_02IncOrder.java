package _04_Recursion;

public class _02IncOrder {
    void main(){
        print(10);
    }

    void print(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        print(n -1 );
        System.out.println(n);
    }
}
