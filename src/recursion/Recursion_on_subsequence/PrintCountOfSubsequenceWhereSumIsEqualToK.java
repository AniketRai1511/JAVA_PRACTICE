package recursion.Recursion_on_subsequence;

import java.util.ArrayList;
import java.util.List;

public class PrintCountOfSubsequenceWhereSumIsEqualToK {

    public static int print(int i, int n, int[] nums, int sum, int k){
        if(i==n){
            if(sum==k){
            //    System.out.println(list.toString());
                return 1;
            }
            return 0;
        }

        sum+=nums[i];
        int count=0;
       count+= print(i+1,n,nums,sum,k);
        sum-=nums[i];

        count+=print(i+1,n,nums,sum,k);
        return count;
    }
    public static void main(String[] args) {
        int [] nums={1,2,1,2,1,1};
        int n= nums.length;
        int k=2;
       // List<Integer> list=new ArrayList<>();
       int count= print(0,n,nums,0,k);
        System.out.println(count);
    }
}
