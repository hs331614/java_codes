import java.util.Scanner;

public class ques1 {
    /* package codechef; // don't place package name! */


        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);

            int count=0;

            int[] week=new int[4];
            for (int i=0;i<4 ;i++ ){
                week[i]=sc.nextInt();
                if(week[i]>=10){
                    count++;
                }
            }
            System.out.println(count);
        }
    }


