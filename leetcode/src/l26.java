import java.util.ArrayList;
import java.util.Arrays;

public class l26 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        int n= nums.length;
        int count=n;
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 0; i < n-1; i++) {
            if (nums[i]!=nums[i+1]){
                list.add(nums[i]);
            }
        }
        list.add(nums[n-1]);
        int x=list.size();
        for (int i = 0; i < x; i++) {
            nums[i]= list.get(i);
        }
        System.out.println(x);
        System.out.println(Arrays.toString(nums));
    }
}
