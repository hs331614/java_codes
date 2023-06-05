public class Q1464 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        int n= nums.length;
        int max1=0,max2=0;
        int max1index=-1,max2index=-1;
        for (int i = 0; i <n; i++) {
            if(nums[i]>max1){
                max1=nums[i];
                max1index=i;
            }
        }
        for (int i = 0; i <n; i++) {
            if(nums[i]>max2 && i!=max1index){
                max2=nums[i];
                max2index=i;
            }
        }

        System.out.println((max1-1)*(max2-1));
    }
}
