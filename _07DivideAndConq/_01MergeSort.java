    package _07DivideAndConq;

    import java.util.Arrays;

    public class _01MergeSort {
      public static void main(String args[]){
            int arr[] = {6,3,9,5,2,8};
            divide(arr, 0, arr.length-1);
            System.out.println(Arrays.toString(arr));
        }

       public static void divide(int arr[], int  start, int end)
       {
            if(start >= end){
                return;
            }

            int mid = start + (end - start ) /2;
            divide(arr, start, mid);
            divide(arr, mid+1, end);
            conquer(arr, start, mid, end);
        }

    public static void conquer(int arr[], int start, int mid, int end){
                int temp[] =  new int[end - start +1];

                int index1 = start;
                int  index2= mid+1;
                int j=0;

                while(index1 <= mid && index2 <= end){
                    if(arr[index1] <= arr[index2]){
                        temp[j++] = arr[index1++];
                    }else{
                        temp[j++] = arr[index2++];
                    }
                }


                while(index1 <= mid){
                    temp[j++] = arr[index1++];
                }

                while(index2 <= end){
                    temp[j++] = arr[index2++];
                }

                int idx = start;
                for(int i=0; i<temp.length; i++){
                    arr[idx++] = temp[i];
                }
        }
    }
