package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class array9 {


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



    public static void main(String[] args) {
        int[] arr1={2,3,100,101,102};
        int []arr2={1,2,3,100};
        union(arr1,arr2);



    }
}
