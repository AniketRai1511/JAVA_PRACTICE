package practice;
import java.util.HashSet;
import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        HashSet<Integer>set=new HashSet<>();
//        for(int i=1;i<n;i++){
//            int num=sc.nextInt();
//            set.add(num);
//        }
//        System.out.println(set.size());

//        int arr[] = {4, 3, 9, 2, 5};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        int rightSum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int leftSum = sum - rightSum - arr[i];
//
//            if (leftSum == rightSum) {
//                System.out.println(i);
//            }
//            rightSum+=arr[i];
//        }

//        // Tow wheel and four wheel
//        int vhe=100;
//        int wheel=300;
//
//        int two_wheel=0;
//        int four_wheel=0;
//
//        four_wheel=(wheel-(2*vhe))/2;
//        two_wheel=vhe-four_wheel;
//        System.out.println(two_wheel+ " and "+four_wheel);
int[]arr={0,1,0,2,3,0,4};
int pos=0;
for(int i=0;i<arr.length;i++){
    if(arr[i]!=0){
        int temp=arr[i];
        arr[i]=arr[pos];
        arr[pos]=temp;
        pos++;
    }
}
for(int x:arr){
    System.out.println(x +" ");
}
    }
}

