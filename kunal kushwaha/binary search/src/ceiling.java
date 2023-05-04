import java.util.Arrays;
import java.util.Scanner;

public class ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target= sc.nextInt();
        System.out.println(ceil(arr,len,target));

    }


    static int ceil(int[] arr, int len, int target) {
        if (target > arr[len- 1]) {
            return -1;
        }
        int start = 0, end = len - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid]>target) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;

    }
}

