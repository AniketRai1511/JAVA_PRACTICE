package sorting;

public class test {
    public static void selection(int [] arr){
        for(int i=0;i<arr.length-2;i++){
            int min=i;
            for(int j=i;j< arr.length-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void bubble(int [] arr){
        for(int i=arr.length-1;i>=1;i--){
            for(int j=0;j<i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void insertion(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
     public static void recursiveBubble(int [] arr, int n,int i){
        if(n==1){
            return;
        }
        if(i==n-1){
            recursiveBubble(arr,n-1,0);
            return;
        }
        if(arr[i]>arr[i+1]){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        recursiveBubble(arr,n,i+1);
     }
     public static void recursiveInsertion(int [] arr,int n){
        if(n== arr.length){
            return;
        }
        int j=n;
        while(j>0 && arr[j-1]>arr[j]){
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        recursiveInsertion(arr,n+1);
     }
    public static void main(String[] args) {
        int [] arr={6,5,4,3,2,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        recursiveInsertion(arr,0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
