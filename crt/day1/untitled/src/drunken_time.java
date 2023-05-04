import java.util.Scanner;

public class drunken_time {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0) {
            int K=sc.nextInt();
            int count=0;
            if(K%2==0){
                count=K;
            }
            else{
                count=K+2;
            }
            System.out.println(count);
        }

    }
}
