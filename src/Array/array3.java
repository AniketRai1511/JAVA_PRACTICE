package Array;

import java.sql.SQLOutput;
import java.util.HashMap;

public class array3 {


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




    public static void main(String[] args) {
    int arr[]={1,2,3,3,4,5,6,12};
    isSorted(arr);

    }

}