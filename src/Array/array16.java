package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class array16 {


    public static int NcR(int n,int r){
        int ans=1;
        // n! / r! (n-r)!  do not do this
        for(int i=0;i<r;i++){
            ans= ans*(n-i);
            ans=ans/(i+1);
        }
        return ans;
    }


    public static void main(String[] args) {
    //    int[] arr={2,3,100,101,102};
        int ans=NcR(8,4);
        System.out.println(ans);


    }
}
