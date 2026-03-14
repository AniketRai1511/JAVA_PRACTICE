package Array;

import java.sql.SQLOutput;
import java.util.HashMap;

public class array1 {
    public static int SecondLargest(int arr[]){
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i]<largest && arr[i]>secondLargest) {
                secondLargest=arr[i];
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }

    public static int SecondSmallest(int [] arr){
        int smallest=arr[0];
        int secondSmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];
            } else if (arr[i]>smallest && arr[i]<secondSmallest) {
                secondSmallest=arr[i];
            }
        }
        return secondSmallest;
    }

    public static void isSorted(int [] arr){
        int isSorted=0;
        for(int i=0;i< arr.length-2;i++){
            if(arr[i]>arr[i+1] && arr[i]!=arr[i+1]){
                isSorted=1;
            }
        }
        if(isSorted==0){
            System.out.println("array is sorted");
        }
        else {
            System.out.println("array is not sorted");
        }
    }

    public  static int RemoveDuplicates(int [] arr){
        int i=0;
        for(int j=1;j< arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

    public static void reverse(int [] arr,int low,int high){
        if(low>=high){
            return;
        }
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        reverse(arr,low+1,high-1);
    }
    public static void rotate(int[] arr,int k){
        k=k% arr.length;
        reverse(arr,0, k-1);
        reverse(arr,k, arr.length-1);
        reverse(arr,0, arr.length-1);
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
    public static int linearSearch(int []arr,int target){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans=i;
                break;
            }
        }
        return ans;
    }

    public static int FindMissing(int [] arr){
        int xor1=0,xor2=0;
        for(int i=0;i< arr.length;i++){
            xor1=xor1^(i+1);
            xor2=xor2^arr[i];
        }
        return xor1^xor2;
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

    public static int MajorityElement(int [] arr){
        int majorityElement=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int Key: map.keySet()){
            if(map.get(Key)>arr.length/2){
                majorityElement=Key;
            }
        }
        return majorityElement;
    }

    public static void rearrangeArray(int [] arr){
        
    }

    public static void NextPermutation(int [] arr){
        int breakPoint=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                breakPoint=i;
                break;
            }
        }
        System.out.println(breakPoint); // comment

        int smallest=Integer.MAX_VALUE;
        for(int j=breakPoint+1;j<arr.length;j++){
            if(arr[j]< smallest && arr[j]>arr[breakPoint]){
                smallest= arr[j];
                int temp=smallest;
                smallest=arr[breakPoint];
                arr[breakPoint]=temp;
            }
        }
        int start=breakPoint+1,end=arr.length-1;
        while(end>start){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static int duplicate(int [] arr){
        int xor1=0;
        int xor2=0;
        for(int i=0;i<arr.length;i++){
            xor1=xor1^arr[i];
            if(i!=0){
                xor2=xor2^(i);
            }
        }
        if((xor1^xor2)==0){
            return arr[0];
        }
        return xor1^xor2;
    }


    public static void main(String[] args) {
//        int arr[]={1,2,3,3};
//        int ans=duplicate(arr);
//        System.out.print(ans);
int n=4;
long result=1;
   for(int i=2;i<=n;i++){
       result*=i;
   }
        System.out.println(result);
//        for(int i=0;i< arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }
//        NextPermutation(arr);
//        System.out.println();
//        for(int i=0;i< arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }
    }

}
