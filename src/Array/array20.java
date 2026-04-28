package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class array20 {

    public  static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j>1+i && nums[j]==nums[j-1]){
                    continue;
                }
                int k=j+1;
                int l=nums.length-1;

                while(k<l){
                    long sum=nums[i];
                    sum=sum+nums[j];
                    sum=sum+nums[k];
                    sum=sum+nums[l];
                    if(sum==target){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1])k++;
                        while(k<l && nums[l]==nums[l+1])l--;
                    }

                    if(sum<target){
                        k++;
                    }
                    if(sum>target){
                        l--;
                    }
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {



    }
}
