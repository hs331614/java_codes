public class sort012 {
    public static void main(String[] args) {
        int n=5;
        int[] a={0,2,1,2,0};

        int[] sort1=new int[n];
        int count0=0,count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                count0++;
            }
            else if(a[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        int k=0;
        while(count0>0){
            sort1[k]=0;
            count0--;
            k++;
        }
        while(count1>0){
            sort1[k]=1;
            count1--;
            k++;
        }
        while(count2>0){
            sort1[k]=2;
            count2--;
            k++;
        }
    }
}
