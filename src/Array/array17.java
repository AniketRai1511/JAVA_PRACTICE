package Array;

public class array17 {
    public static int NcR(int n,int r){
        int ans=1;
        // n! / r! (n-r)!  do not do this
        for(int i=0;i<r;i++){
            ans= ans*(n-i);
            ans=ans/(i+1);
        }
        return ans;
    }
    public static void printCol(int r){
        for(int i=1;i<=r;i++){
            System.out.print(NcR(r-1,i-1) + " ");
        }
    }

    public static void printCol2(int n){
        int ans=1;
        System.out.print(ans + " ");
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/(i);
            System.out.print(ans + " ");
        }
    }



    public static void main(String[] args) {
    //    int[] arr={2,3,100,101,102};
        printCol(5);
  //      System.out.println(ans);


    }
}
