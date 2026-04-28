package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class array18 {


    public static void printPascalTriangle(int r){
        for(int i=1;i<=r;i++){
            int ans=1;
            System.out.print(ans + " ");
            for(int j=1;j<i;j++){
                ans=ans*(i-j);
                ans=ans/j;
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
     //   int[] arr={2,3,100,101,102};
        printPascalTriangle(5);
     //   System.out.println(ans);


    }
}
