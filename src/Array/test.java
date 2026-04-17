package Array;
import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class test {
    public static void ZerosToEnd(int arr[]){
        int temp[]=new int[3];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[k++]=arr[i];
            }
        }
        for(int i=0;i< temp.length;i++){
            arr[i]=temp[i];
        }
        for(int i= temp.length;i< arr.length;i++){
            arr[i]=0;
        }
    }
    public static void ZerosToEnd2(int [] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i< arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }

    public static void ZerosToEnd3(int [] arr){
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
        }
        while (k< arr.length){
            arr[k]=0;
            k++;
        }
    }

    public static int[] union(int [] arr1,int [] arr2){
        Set<Integer> set= new HashSet<>();
        int i=0;
        int j=0;
        while(i< arr1.length&&j< arr2.length){
            if(arr1[i]<=arr2[j]){
                set.add(arr1[i]);
                i++;
            }
            else{
                set.add(arr2[j]);
                j++;
            }
        }
        while(i<arr1.length){
            set.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            set.add(arr2[j]);
            j++;
        }
        int [] temp=new int [set.size()];
        int k=0;
        for(int value: set){
            temp[k++]=value;
        }
        return temp;
    }

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

                  // questions on 2d array

    public static void print2DArray(int [][]arr1){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
    public  static void setZeroes(int[][] matrix) {
        int [] row=new int [matrix.length];
        int [] col=new int [matrix[matrix.length-1].length];
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
            for(int k = 0; k <matrix.length; k++){
                for(int j = 0; j<matrix[k].length; j++){
                    if(row[k]==1||col[j]==1){
                        matrix[k][j]=0;
                    }
                }
            }

    }

    public static void Rotate2dArray(int [][] arr){
      //  int [][] ans=new int [arr.length][arr[arr.length-1].length];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

    }

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

    public static int NcR(int n,int r){
        int ans=1;
        // n! / r! (n-r)!  do not do this
        for(int i=0;i<r;i++){
            ans= ans*(n-i);
            ans=ans/(i+1);
        }
        return ans;
    }

    public static void printCol(int r){
        for(int i=1;i<=r;i++){
            System.out.print(NcR(r-1,i-1) + " ");
        }
    }

    public static void printCol2(int n){
        int ans=1;
        System.out.print(ans + " ");
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/(i);
            System.out.print(ans + " ");
        }
    }

    public static void printPascalTriangle(int r){
        for(int i=1;i<=r;i++){
            int ans=1;
            System.out.print(ans + " ");
            for(int j=1;j<i;j++){
                ans=ans*(i-j);
                ans=ans/j;
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }

    public static List<Integer> MaxEle3(int [] arr){
        List<Integer> ans=new ArrayList<>();
        int element=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count>(arr.length/3)){

            }
            if(count==0){
                count++;
                element=arr[i];
            }
            else if(arr[i]==element){
                count++;
            }
            else {
                count--;
            }
        }
        ans.add(element);
        return ans;
    }

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
