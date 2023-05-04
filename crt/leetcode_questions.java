public class leetcode_questions {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0},nums2={2,5,6};
        int m=3,n=3;
        int[] arr=new int[m+n];
        int k=0,l=0;
        for(int i=0;i<m+n;i++){
            if(nums1[k]<nums2[l]&&k<m&&l<n){
                arr[i]=nums1[k];
                k++;
            }
            else if(nums1[k]>=nums2[l]&&k<m&&l<n){
                arr[i]=nums2[l];
                l++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
