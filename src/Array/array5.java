package Array;

import java.sql.SQLOutput;
import java.util.HashMap;

public class array5 {


    public static void reverse(int [] arr,int low,int high){
        if(low>=high){
            return;
        }
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        reverse(arr,low+1,high-1);
    }



    public static void main(String[] args) {
   int arr[]={12,2,3,3};
   reverse(arr,0,arr.length-1);
   for(int i=0;i<arr.length;i++){
       System.out.print(arr[i] + " ");
   }

    }

}