package sorting;

public class MergeSort {
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
    public static void main(String[] args) {
        int arr[]={2,4,5,1,3,7,4};
        mergeSort(arr,0, arr.length-1);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
