public class watertraap {
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        int a=0;
        int sum=0;
        for(int i=1;i<height.length-1;i++){
            a=Math.min(height[i-1]-height[i],height[i+1]-height[i]);
            System.out.println(a);
            if(a>0){
                sum=sum+a;            }
        }
        System.out.println(sum);
    }
}
