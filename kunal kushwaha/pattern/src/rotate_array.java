import java.util.Arrays;
import java.util.Scanner;

public class rotate_array {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();

        }

        for(int j=N;j>0;j--){
            A[j]=A[j-1];

        }
        System.out.println(Arrays.toString(A));

    }
}
