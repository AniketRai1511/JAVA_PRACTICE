package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class array19 {

    public static List<Integer> MaxEle3(int [] arr){
        List<Integer> ans=new ArrayList<>();
        int element=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(count>(arr.length/3)){

            }
            if(count==0){
                count++;
                element=arr[i];
            }
            else if(arr[i]==element){
                count++;
            }
            else {
                count--;
            }
        }
        ans.add(element);
        return ans;
    }



    public static void main(String[] args) {
        int[] arr={2,3,3,3,2,2,1};
        List<Integer>ans=MaxEle3(arr);



    }
}
