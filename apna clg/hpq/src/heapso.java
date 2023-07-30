public class heapso {
    public static void heapSort(int arr[]){
        int n=arr.length;
        for (int i = n/2; i >=0 ; i--) {
            heapify(arr,i,n);
        }

        for (int i = n-1; i >0 ; i++) {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            
            heapify(arr,0,i);
        }
    }

    private static void heapify(int arr[],int i, int n) {

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3};
        heapSort(arr);
    }
}
