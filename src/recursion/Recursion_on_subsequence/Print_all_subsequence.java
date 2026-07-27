package recursion.Recursion_on_subsequence;
import java.util.*;
public class Print_all_subsequence {

    public static void print(int n,int i,int [] arr,List<Integer> list){
        if(i==n){
            System.out.println(list.toString());
            return;
        }
        list.add(arr[i]);
        print(n,i+1,arr,list);
        list.remove(list.size() - 1);
        print(n,i+1,arr,list);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> list=new ArrayList<>();
        print(n,0,arr,list);
    }
}
