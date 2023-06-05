import java.util.ArrayList;

public class Q448 {
    public static void main(String[] args) {
     int[] nums={4,3,2,7,8,2,3,1};
     int n=nums.length;
        for (int i = 1; i <= n; i++) {
            if(nums[i]!=i){
                nums[i]=nums[i]^nums[nums[i]];
                nums[nums[i]]=nums[i]^nums[nums[i]];
                nums[i]=nums[i]^nums[nums[i]];
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (nums[i] != i) {
                ans.add(i);

            }
        }

        System.out.println(ans);

    }
}

//done
