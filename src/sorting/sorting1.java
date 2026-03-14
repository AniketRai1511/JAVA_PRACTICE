package sorting;

public class sorting1 {
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
        int [] arr={4,3,2,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        //SelectionSort(arr);

        System.out.println();
        for(int i=0;i<InsertionSort(arr).length;i++){
            System.out.print(InsertionSort(arr)[i] + " ");
        }
    }
}
