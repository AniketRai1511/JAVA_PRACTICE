package Binary_Search;
import java.util.*;
public class test {
    public static int Minimum(int [] arr){
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            minimum=Math.min(arr[i],minimum);
        }
        return minimum;
    }
    public static int Maximum(int [] arr){
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maximum=Math.max(arr[i],maximum);
        }
        return maximum;
    }
    // function to calculate number of bouquet ( using binary search on answers)
//    public static int No_Bouquet(int [] arr,int m,int k){
//        int count=0;
//        int NBouquet=0;
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]<=k){
//                count++;
//            }
//            else{
//
//            }
//        }
//    }
    public static void main(String[] args) {

    }
}
