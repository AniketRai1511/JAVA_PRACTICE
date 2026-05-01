package sorting;

public class BubbleSort {
    public static int[] BubbleSort(int [] arr){
        int isSort=0;
        for(int i=arr.length-1;i>=1;i--){

            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSort=1;
                }
            }
            if(isSort==0){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,1,3,7,4};
        BubbleSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
