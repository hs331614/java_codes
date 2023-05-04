import java.util.Arrays;

public class dialgonalsum {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            sum=sum+mat[i][i];
            sum=sum+mat[i][mat.length-1-i];
        }
        if(n%2!=0){
            sum=sum-mat[n/2][n/2];
        }
        for (int j = 0; j < n; j++) {
            System.out.println(Arrays.toString(mat));
        }
    }
}
