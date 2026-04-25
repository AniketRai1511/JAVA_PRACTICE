package Array;

import java.sql.SQLOutput;
import java.util.HashMap;

public class array6 {


    public static void reverse(int [] arr,int low,int high){
        if(low>=high){
            return;
        }
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        reverse(arr,low+1,high-1);
    }
    public static void rotateFromLeft(int[] arr,int k){
        k=k% arr.length;
        reverse(arr,0, k-1);
        reverse(arr,k, arr.length-1);
        reverse(arr,0, arr.length-1);
    }




    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    rotateFromLeft(arr,2);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }

}