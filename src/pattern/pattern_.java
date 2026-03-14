package pattern;
import java.util.*;
public class pattern_ {
    Scanner sc=new Scanner(System.in);
   public static void function1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void function2(int n){
       for (int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }

    public static void function3(int n){
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i+1;j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }

    public static void function4(int n){
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int k=1;k<=i;k++){
               System.out.print("*");
           }
           System.out.println();
       }
    }

    public static void function5(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void function6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void function7(int n){
       int count =1;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print(count + " ");
               count++;
           }
           System.out.println();
        }
    }

    public static void function8(int n){
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               if((i+j)%2==0){
                   System.out.print(1);
               }
               else{
                   System.out.print(0);
               }
           }
           System.out.println();
       }
    }

    public static void function9(int n){
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int k=1;k<=n;k++){
               System.out.print("*");
           }
           for(int l=1;l<=i-1;l++){
               System.out.print(" ");
           }
           System.out.println();
       }
    }

    public static void function10(int n){
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
               if(i==1||j==1||i==n||j==n){
                   System.out.print("* ");
               }
               else {
                   System.out.print("  ");
               }
           }
           System.out.println();
       }
    }

    public static void function11(int n){
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int k=1;k<=(2*i-1);k++){
               System.out.print("*");
           }
           for (int l=1;l<=n-i;l++){
               System.out.print(" ");
           }
           System.out.println();
       }
    }

    public static void function12(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*n-2*i-1);k++){
                System.out.print("*");
            }
            for (int l=1;l<=i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void function13(int n){
       for(int i=1;i<=2*n-1;i++){
           if(i<=n){
               for(int j=1;j<=i;j++){
                   System.out.print("*");
               }
           }
           else{
               for(int j=1;j<=2*n-i;j++){
                   System.out.print("*");
               }
           }
           System.out.println();
       }
    }

    public static void function14(int n){
       for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
               System.out.print(j);
           }
           for(int k=1;k<=2*n-2*i;k++){
               System.out.print(" ");
           }
           for(int l=i;l>=1;l--){
               System.out.print(l);
           }
           System.out.println();
       }
    }

    public static void function15(int n){
       for(int i=0;i<n;i++){
           for(int j=0;j<n-i;j++){
               System.out.print("*");
           }
           for(int k=0;k<i*2;k++){
               System.out.print(" ");
           }
           for(int l=0;l<n-i;l++){
               System.out.print("*");
           }
           System.out.println();

       }

    }

    public static void function16(int n){
       for(int i=1;i<=n;i++){
           for(int j=0;j<i;j++){
               System.out.print("*");
           }
           for(int k=0;k<2*n-2*i;k++){
               System.out.print(" ");
           }
           for(int l=0;l<i;l++){
               System.out.print("*");
           }
           System.out.println();
       }
    }

    public static void function17(int n){
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int k=0;k<2*n-2*i;k++){
                    System.out.print(" ");
                }
                for(int l=1;l<=i;l++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=1;j<=2*n-i;j++){
                    System.out.print("*");
                }
                for(int k=0;k<2*i-2*n;k++){
                    System.out.print(" ");
                }
                for(int l=1;l<=2*n-i;l++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        int n=5;
        function1(n);
        System.out.println();
        function2(n);
        System.out.println();
        function3(n);
        System.out.println();
        function4(n);
        System.out.println();
        function5(n);
        System.out.println();
        function6(n);
        System.out.println();
        function7(n);
        System.out.println();
        function8(n);
        System.out.println();
        function9(n);
        System.out.println();
        function10(n);
        System.out.println();
        function11(n);
        System.out.println();
        function12(n);
        System.out.println();
        function13(n);
        System.out.println();
        function14(n);
        System.out.println();
        function15(n);
        function16(n);
        System.out.println();
        function17(n);
    }

}
