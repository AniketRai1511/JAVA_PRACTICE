package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class array21 {

    public static int [] Repeating_Missing(int [] arr){
        int repeat=-1,miss=-1;

        for(int i=1;i<=arr.length;i++){
            int count=0;
            for(int j=0;j< arr.length;j++){
                if(i==arr[j]){
                    count++;
                }
                if(count==2){
                    repeat=i;
                }
                if(count==0){
                    miss=i;
                }
                if(repeat!=-1 && miss!=-1){
                    break;
                }
            }
        }
        int [] ans=new int[2];
        ans[0]=repeat;
        ans[1]=miss;
        return ans;
    }

    public static int MaxProduct(int [] nums){
        int max_product=Integer.MIN_VALUE;
        int prefix=1,suffix=1;
        for(int i=0;i<nums.length;i++){
            if(prefix==0)prefix=1;
            if(suffix==0)suffix=1;
            prefix=prefix*nums[i];
            suffix=suffix*nums[nums.length-i-1];
            max_product=Math.max(max_product,Math.max(prefix,suffix));
        }
        return max_product;
    }


    public static void main(String[] args) {
        int[] arr={1,1,2,3,4};
        int []ans=Repeating_Missing(arr);
        for(int i=0;i<ans.length;i++){
            System.out.printf(ans[i] + " ");
        }


    }
}
