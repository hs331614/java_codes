import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2, 1};
        insso(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] insso(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]) {
                swap1(arr,j-1, j);
                j--;
            }
        }
        return arr;
    }

     static void swap1(int[] arr,int a, int b) {
        arr[a]=arr[a]^arr[b];
        arr[b]=arr[a]^arr[b];
        arr[a]=arr[a]^arr[b];
    }


    }

