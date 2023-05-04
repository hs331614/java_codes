import java.util.Scanner;

public class digit_of_number {

        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            while(T>0){
                int d=sc.nextInt();
                int count1=0;
                int count0=0;
                while(d>0){
                    int rem=d%10;
                    if(rem==1){
                        count1++;
                    }
                    else{
                        count0++;
                    }
                    d=d/10;}
                if(count0==1 || count1==1){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }

                T--;}
        }
    }
