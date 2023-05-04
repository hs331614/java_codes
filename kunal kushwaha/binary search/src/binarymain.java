import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class binarymain {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        int[] arr={2,3,4,6,7};
        int target=7;
//        int ans=search(arr,target);
//        System.out.println(ans);
        int start=0;
        int end= arr.length - 1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if (arr[mid]>target) {
                end=mid-1;
                mid=(start+end)/2;
            } else if (arr[mid]<target) {
                start=mid+1;
                mid=(start+end)/2;
            }else {
                System.out.println(mid);
                break;
            }
        }

    }

//    static int  search(int[] arr,int target){
////        int start=0;
////        int end= arr.length - 1;
////        int mid=(arr.length-1)/2;
////        while(start<end){
////            if (arr[mid]>arr[target]) {
////                end=mid;
////                mid=(start+end)/2;
////            } else if (arr[mid]<arr[target]) {
////                start=mid;
////                mid=(start+end)/2;
////            }else {
////                return mid;
////            }
////        }
////        return -1;
//    }


}

