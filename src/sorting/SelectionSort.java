package sorting;

public class SelectionSort {
    public static void SelectionSort(int arr[]){
        for(int i=0;i<=arr.length-2;i++){
            int minIndex=i;
            for(int j=i;j<=arr.length-1;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,1,3,7,4};
        SelectionSort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
