package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class array12 {


    public static int SingleNumber(int [] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int ans=0;
        int [] hash=new int [max+1];
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        for(int i=0;i< hash.length;i++){
            if(hash[i]==1){
                ans=i;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={2,2,3,4,4,5,5};
        int ans=SingleNumber(arr);
        System.out.println(ans);


    }
}
