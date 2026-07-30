package _06Pattern;

public class _01SimplePattern {
    void main(){
        int n = 5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
