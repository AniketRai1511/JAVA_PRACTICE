package recursion;
import java.util.*;
public class Multiple_Recursion_calls {

    //In this function there is multiple recursion call
    public static int fib(int n){
        if(n<=1){
            return n;
        }
        int first=fib(n-1); // first recursion call
        int second=fib(n-2); // second recursion call
        return first+second;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
}
