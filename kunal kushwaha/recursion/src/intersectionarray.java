import java.util.ArrayList;
import java.util.Arrays;

public class intersectionarray {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length-1;i++){
            if(nums1[i]!=nums1[i+1]){
                for(int j=0;j<nums2.length-1;j++){
                    if(nums2[j]!=nums2[j+1]&&nums1[i+1]==nums2[j+1]){
                        list.add(nums1[i+1]);
                    }
                }
            }
        }

        for(int j=0;j<nums2.length-1;j++){
            if(nums1[0]==nums2[j]){
                list.add(nums1[0]);
                break;
            }
        }
        
        int[] arr=new int[list.size()];
        for(int k=0;k<arr.length;k++){
            arr[k]=list.get(k);
        }
        System.out.println(Arrays.toString(arr));
    }
}
