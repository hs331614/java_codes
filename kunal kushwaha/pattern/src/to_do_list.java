import java.util.Scanner;

public class to_do_list {
    /* package codechef; // don't place package name! */


        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int match1=0;
            int[] arr={6,2,5,5,4,5,6,3,7,6};
            // int sum=0;
            for (int i=0;i<n ;i++ ){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=a+b;
                int sum=0;
                while(c>=0){
                    int temp=c%10;
                    c=c/10;
                    sum=sum+arr[temp];
                    // switch(temp){

                    //     case 0:
                    //      match1=6;
                    //     break;
                    //     case 1:
                    //      match1=2;
                    //     break;
                    //     case 2:
                    //      match1=5;
                    //     break;
                    //     case 3:
                    //      match1=5;
                    //     break;
                    //     case 4:
                    //      match1=4;
                    //     break;
                    //     case 5:
                    //      match1=5;
                    //     break;
                    //     case 6:
                    //      match1=6;
                    //     break;
                    //     case 7:
                    //      match1=3;
                    //     break;
                    //     case 8:
                    //      match1=7;
                    //     break;
                    //     case 9:
                    //      match1=6;
                    //     break;

                    // sum=sum+match1;
                }

                System.out.println(sum);
            }
        }
    }


