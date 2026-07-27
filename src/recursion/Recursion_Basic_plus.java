package recursion;
import java.util.*;
public class Recursion_Basic_plus {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return sum(n-1)+n;
    }

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
        System.out.println(fact(n));
    }
}
