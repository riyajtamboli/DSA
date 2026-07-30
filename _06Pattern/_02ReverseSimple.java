package _06Pattern;

public class _02ReverseSimple {
    void main(){
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
