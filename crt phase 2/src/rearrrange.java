import java.util.Arrays;
import java.util.Collections;

public class rearrrange {
    public static void main(String[] args) {
        int[] arr={1,2,5,-3,-4,7};
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        int i=0;
        while(arr[i]<0){

        }
    }
}
