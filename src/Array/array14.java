package Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class array14 {

    // questions on 2d array

    public static void print2DArray(int [][]arr1){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
    public  static void setZeroes(int[][] matrix) {
        int [] row=new int [matrix.length];
        int [] col=new int [matrix[matrix.length-1].length];
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int k = 0; k <matrix.length; k++){
            for(int j = 0; j<matrix[k].length; j++){
                if(row[k]==1||col[j]==1){
                    matrix[k][j]=0;
                }
            }
        }

    }

    public static void Rotate2dArray(int [][] arr){
        //  int [][] ans=new int [arr.length][arr[arr.length-1].length];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr[i].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

    }


    public static void main(String[] args) {


    }
}
