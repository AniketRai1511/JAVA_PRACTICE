package Binary_Search;
import java.util.*;
public class Binary_Search_1 {
    public static int BinarySearch(int [] arr,int low ,int high,int target){
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        if(target==arr[mid]){
            return mid;
        }
        else if(target>arr[mid]){
            return BinarySearch(arr,mid+1,high,target);
        }
        else{
            return BinarySearch(arr,low,mid-1,target);
        }
    }

    // searching a target in a rotated sorted array
    // brute force solution would run in O(n) time complexity using the linear search algo
    // optimal solution using the concept of binary search
    public static int SearchRotatedSortedArray(int [] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[low]<=arr[mid]){
                if(target>=arr[low] && target<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(target>=arr[mid] && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    // find minimum in sorted rotated array -> using binary search

    public static int Minimum(int [] arr){
        int low=0;
        int high=arr.length-1;
        int minimum=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                minimum=Math.min(arr[low],minimum);
                low=mid+1;
            }
            else {
                minimum=Math.min(arr[mid],minimum);
                high=mid-1;
            }
        }
        return minimum;
    }

    public static int sqrt(int n){
        int ans=0;
        int low=1;
        int high=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid>n){
                high=mid-1;
            }
            else if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int [] arr={11,0,2,4,6,7,8,10};
        int ans=sqrt(25);
        System.out.println(ans);
    }
}
