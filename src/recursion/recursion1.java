package recursion;

public class recursion1 {
    public static void printName(int n){
        if(n==1){
            return;
        }
        System.out.print("Aniket rai");
        System.out.println();
        printName(n-1);

    }

    public static void printNum(int n){
        if(n==0){
            return;
        }
        printNum(n-1);
        System.out.println(n);

    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }

        return n*factorial(n-1);
    }
    public static void fibonacci(int first,int second,int n){
        if(n==0){
            return;
        }
        System.out.println(first);
        fibonacci(second,first+second,n-1);
    }

    public static void reverse(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverse(arr,start+1,end-1);
    }

    public static boolean checkPalindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)==str.charAt(end)){
          return   checkPalindrome(str,start+1,end-1);
        }
        return false;

    }
    public static void main(String [] args){
        String str="madam";
        boolean a=checkPalindrome(str,0,str.length()-1);
        System.out.println(a);

    }
}
