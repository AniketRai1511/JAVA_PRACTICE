package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class array7 {


    public static int LongestSubSequence(int [] nums){
        Arrays.sort(nums);
        int pre=Integer.MIN_VALUE;
        int longest=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]-1)==pre){
                count++;
                pre=nums[i];
            }
            else if((pre)!=nums[i]){
                count=1;
                pre=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr={2,3,100,101,102};
        int ans=LongestSubSequence(arr);
        System.out.println(ans);


    }
}
