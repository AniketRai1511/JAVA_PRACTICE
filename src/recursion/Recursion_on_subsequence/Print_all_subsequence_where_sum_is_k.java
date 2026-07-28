package recursion.Recursion_on_subsequence;

import java.util.ArrayList;
import java.util.List;

public class Print_all_subsequence_where_sum_is_k {

    public static void print(int i,int n,int[] nums,int sum,int k,List<Integer> list){
        if(i==n){
            if(sum==k){
                System.out.println(list.toString());
            }
            return;
        }
        list.add(nums[i]);
        sum+=nums[i];
        print(i+1,n,nums,sum,k,list);
        sum-=nums[i];
        list.remove(list.size()-1);
        print(i+1,n,nums,sum,k,list);
    }
    public static void main(String[] args) {
        int [] nums={1,2,1,2,1,1};
        int n= nums.length;
        int k=2;
        List<Integer> list=new ArrayList<>();
        print(0,n,nums,0,k,list);
    }
}
