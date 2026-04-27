package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class array13 {


    public static int MaxSubArray(int [] arr,int k){
        int i=0,j=0,maxLength=Integer.MIN_VALUE;
        int sum=0,count=0;

        while(j<arr.length){
            sum=sum+arr[j];
            if(sum==k){
                count++;
                if((j-i+1)>maxLength){
                    maxLength=(j-i+1);
                }
                j++;
            }
            else if(sum<k){
                j++;
            }
            else if(sum>k){
                while(sum>k){
                    sum=sum-arr[i];
                    i++;
                }
                j++;
            }
        }

        if(maxLength==Integer.MIN_VALUE){
            return 0;
        }

        return maxLength;
    }

    // max SubArray using prefix sum method
    public static int MaxSubArray2(int [] arr,int k){
        long sum=0;
        int maxLength=0;
        HashMap<Long,Integer> map=new HashMap<Long, Integer>();
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==k){
                maxLength=i+1;
            }
            if(map.containsKey(sum-k)){
                if(maxLength<(i-map.get(sum-k))){
                    maxLength=(i-map.get(sum-k));
                }
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLength;
    }
    // count of maxSubArray
    public static int CountMaxSumOf_k(int [] arr,int k){
        int sum=0, count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1); // store sum 0 for getting the first sum=k
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static int SubArraySumDivisibleByK(int [] arr,int k){
        int sum=0,rem=0,count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            rem=sum%k;
            if(rem<0){
                rem=rem+k;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }


    public static void main(String[] args) {
        int[] arr={2,3,2,2,1,1,1};
        int ans=MaxSubArray(arr,5);
        System.out.println(ans);


    }
}
