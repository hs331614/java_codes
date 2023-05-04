import java.util.Scanner;

public class drunken
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0) {
            int K=sc.nextInt();
            int count=0;
            while(K>0){
                if (K<=3){
                    K=K-3;
                    count++;
                }
                else{
                    K=K-1;
                    count=count+2;
                }
            }
            System.out.println(count);
        }
    }
}
