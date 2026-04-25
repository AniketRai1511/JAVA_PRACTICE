package Array;

import java.sql.SQLOutput;
import java.util.HashMap;

public class array4 {

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


    public static void main(String[] args) {
    int arr[]={1,2,3,3,4,4,5,5};
    int ans=RemoveDuplicates(arr);
        System.out.println(ans);
        System.out.println();
        for(int i=0;i<ans;i++){
            System.out.print(arr[i] + " ");
        }
    }

}