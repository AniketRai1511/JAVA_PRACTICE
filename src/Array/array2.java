package Array;

import java.sql.SQLOutput;
import java.util.HashMap;

public class array2 {


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

    public static void main(String[] args) {
      int arr[]={1,2,3,3};

int result=SecondSmallest(arr);
        System.out.println(result);

    }

}