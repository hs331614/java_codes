import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class bubbly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
           arr[i]=sc.nextInt();
        }
       arr= selection(arr,n);
        System.out.println(Arrays.toString(bubblesort(arr,n)));
        System.out.println(Arrays.toString(arr));
    }

    static int[] bubblesort(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                    count++;
                }
                if (count == 0) {
                    return arr;

                }
            }

        }
        return arr;
    }

    static int[] selection(int[] arr, int n){
        int min;
        for (int i = 0; i < n; i++) {
            min=i;
            for (int j = i+1; j < n ; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
                if (min != i) {
                    arr[min]=arr[min]^arr[i];
                    arr[i]=arr[min]^arr[i];
                    arr[min]=arr[min]^arr[i];


                }
            }
       return arr; }
    }

