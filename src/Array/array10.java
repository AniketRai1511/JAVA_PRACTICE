package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class array10 {


    public static int FindMissing(int [] arr){
        int ans=0;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<= arr.length;i++){
            if(set.contains(i)==false){
                ans=i;
                break;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr={0,2,3,4,5};
        int ans=FindMissing(arr);
        System.out.println(ans);


    }
}
