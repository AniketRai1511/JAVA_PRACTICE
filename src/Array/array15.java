package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class array15 {


    // maximum water in a container

    public static int MaxWater(int [] arr){
        int ans=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int height = Math.min(arr[i], arr[j]);
                int width = j - i;
                int area = height * width;
                ans = Math.max(ans, area);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr={2,3,100,101,102};
        int ans=MaxWater(arr);
        System.out.println(ans);


    }
}
