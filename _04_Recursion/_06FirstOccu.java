package _04_Recursion;

public class _06FirstOccu {
    void main(){
        int arr[] = {8,5,1,2,4,2,5,1};
        System.out.println(firstOccurence(arr, 0, 2));
    }

    int firstOccurence(int arr[], int index, int key){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == key){
            return index;
        }

        return firstOccurence(arr, index+1, key);
       
    }
}
