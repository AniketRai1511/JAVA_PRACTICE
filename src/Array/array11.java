package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class array11 {


    public static int Max1(int [] arr){
        int ans=0;
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==1){
                count++;
                if(count>ans){
                    ans=count;
                }
            }
            else {
                count=0;
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        int[] arr={2,3,1,1,1,3,4,1,1,2};
        int ans=Max1(arr);
        System.out.println(ans);


    }
}
