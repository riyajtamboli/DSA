package Basic;

public class _03Swap {
    void main(){
        int a = 10;
        int b = 5;

        System.out.println("a before swap = "+a + " And B = "+b);
        a = a-b;
        b = a+b;

        System.out.println("a after swap = "+a + " And B = "+b);
    }
}
