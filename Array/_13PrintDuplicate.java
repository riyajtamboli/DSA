package Array;

import java.util.HashSet;

public class _13PrintDuplicate {
    void main(){
        int arr[] = {1,1,2,2,3,4};
        HashSet<Integer> hs = new HashSet<>();

        for(int i: arr){
            if(!hs.add(i)){
                System.out.print(i + " ");
            }
        }
    }
}
