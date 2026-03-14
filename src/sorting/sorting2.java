package sorting;

public class sorting2 {
    public static int[] mergeSort(int [] arr,int low,int high){
        if(low>=high){
            return arr;
        }
            int mid=(low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
          int[] temp=  merge(arr,low,mid,high);

        return temp;
    }
    public static int[] merge(int arr[],int low,int mid,int high){
        int count=0;
        int left=low;
        int right=mid+1;
        int [] temp=new int[high-low+1];
        int k=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k++]=arr[left];
                left++;
            }
            else {
                count+=mid-left+1;
                temp[k++]=arr[right];
                right++;
            }
        }
        while (left<=mid){
            temp[k++]=arr[left];
            left++;
        }
        while (right<=high){
            temp[k++]=arr[right];
            right++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
        return arr;
    }

    public static void BubbleSortRecursive(int [] arr,int n,int index){
        if(n==1){
            return;
        }
        if(index==n-1){
             BubbleSortRecursive(arr,n-1,0);
             return;
        }

        if(arr[index]>arr[index+1]){
            int temp=arr[index];
            arr[index]=arr[index+1];
            arr[index+1]=temp;
        }
        BubbleSortRecursive(arr,n,index+1);

    }
    // quick sort not completed, will do later.......


//    public static void QuickSort(int [] arr,int low ,int high){
//        if(low>=high){
//            return;
//        }
//        int partition=partitionIndex(arr,low,high);
//        QuickSort(arr,low,partition-1);
//        QuickSort(arr,partition+1,high);
//    }
//    public static int partitionIndex(int [] arr,int low,int high){
//        int pivot=arr[low];
//        int left=0,right=0;
//        while (high>=low){
//            if(arr[low]>pivot){
//                left=low;
//                low++;
//            }
//            if(arr[high]<pivot){
//                right=high;
//                high--;
//            }
//            int temp=arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp;
//        }
//        int temp=arr[left];
//        arr[left]=pivot;
//        pivot=temp;
//        return left;
//    }

    public static void main(String[] args) {
        int arr[]={7,4,1,5,3};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
