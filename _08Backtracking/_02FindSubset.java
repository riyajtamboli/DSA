package _08Backtracking;

public class _02FindSubset {
    public static void subset(String str, String ans, int index){
        if(str.length() == index){
            if(ans.length() ==0 ){
                System.out.println("Null");
            }else{

                System.out.println(ans);
            }
            return;
        }
        subset(str, ans + str.charAt(index), index+1); //yes choice
        subset(str, ans, index+1);  //no
    }
    void main(){
        String str = "abc";
        subset(str, "", 0);

    }
}
