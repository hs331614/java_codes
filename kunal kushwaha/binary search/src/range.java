public class range {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ans={-1,-1};
            ans[0]=searchindex(nums,target,true);
            if(ans[0]!=-1){
                ans[1]=searchindex(nums,target,false);
            }
            return ans;
        }

        static int searchindex(int[] nums,int target,boolean flagmin){
            int ans=-1;
            int start=0,end=nums.length;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]>target){
                    end=mid-1;
                }
                else if(nums[mid]<target){
                    start=mid+1;
                }
                else{
                    if(flagmin){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
            }
            return ans;
        }
    }
}
