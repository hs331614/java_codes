public class shufflearr {
    public static void main(String[] args) {
        int[] nums= {1,2,3,1,1,3};
        int count=0;
        // int pivot=1;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
                // pivot++;
            }
        }
        System.out.println(count);
    }
}
