package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class array8 {
    public static void ZerosToEnd0(int arr[]){
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
        }
        while(k<arr.length){
            arr[k++]=0;
        }
    }

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




    public static void main(String[] args) {
        int[] arr={1,2,3,0,0,6,0,3,0,4};
        ZerosToEnd(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }


    }
}
