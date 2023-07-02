import java.util.Arrays;

public class l189 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        int n= nums.length;
        int count=n;
        if (k%n==0){
            System.out.println(Arrays.toString(nums));
            return;
        }
        int[] arrn=new int[k];
        for (int i = 0; i <k ; i++) {
            arrn[k-1-i]=nums[n-1-i];
        }
        for (int i = n-k-1; i >= 0; i--) {
            nums[i+k]=nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i]=arrn[i];
        }
        System.out.println(Arrays.toString(nums));


    }
}
