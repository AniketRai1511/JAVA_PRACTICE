package sorting;

public class InsertionSort {
    public static int [] InsertionSort(int [] arr){
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,1,3,7,4};
        InsertionSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
