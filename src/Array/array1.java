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

    public static void main(String[] args) {
      int arr[]={1,2,3,30};
int ans=SecondLargest(arr);
        System.out.println(ans);


    }

}
