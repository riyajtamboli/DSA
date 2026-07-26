package Basic;

public class _01PrimeNumber {
    void main(){
        primeNumber(10);
    }

    void primeNumber(int n){
        
        for(int i=1; i<=n; i++){
            int count = 0;
            for(int j=1; j<=i; j++){

                if(i % j == 0 ){
                    count++;
                }
    
    
            }
            if(count == 2){
                System.out.println(i);
            }
        }
    }
}
