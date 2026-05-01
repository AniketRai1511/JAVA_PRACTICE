package sorting;

public class QuickSort {
    public static void QuickSort(int [] arr,int low ,int high){
        if(low>=high){
            return;
        }
        int partition=partitionIndex(arr,low,high);
        QuickSort(arr,low,partition-1);
        QuickSort(arr,partition+1,high);
    }
    public static int partitionIndex(int [] arr,int low,int high){
        int pivot=arr[low];
        int left=0,right=0;
        while (high>=low){
            if(arr[low]>pivot){
                left=low;
                low++;
            }
            if(arr[high]<pivot){
                right=high;
                high--;
            }
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
        int temp=arr[left];
        arr[left]=pivot;
        pivot=temp;
        return left;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,1,3,7,4};
        QuickSort(arr,0, arr.length-1);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
