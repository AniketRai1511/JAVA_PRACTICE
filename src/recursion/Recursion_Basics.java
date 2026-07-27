package recursion;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;
public class Recursion_Basics {
    public static int count=0;
    public static void fun(){
        if(count==3){
            return;
        }
        System.out.print(count+ " ");
        count++;
        fun();
    }
    public static void name(int n){
        if(n==0){
            return;
        }
        System.out.println("Aniket Rai");
        name(n-1);
    }

    public static void Print_1_to_n(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i + " ");
        Print_1_to_n(i+1,n);
    }
    public static void backTrack_1_to_n(int n){
        if(n<1){
            return;
        }
        backTrack_1_to_n(n-1);
        System.out.print(n+ " ");
    }
    public static void backTrack_n_to_1(int i,int n){
        if(i>n){
            return;
        }
        backTrack_n_to_1(i+1,n);
        System.out.print(i+ " ");
    }
    public static void main(String[] args) {
       // fun();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        name(n);
        Print_1_to_n(1,n);
        System.out.println();
        backTrack_1_to_n(n);
        System.out.println();
        backTrack_n_to_1(1,n);
    }
}
