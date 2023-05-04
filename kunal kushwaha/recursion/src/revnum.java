import java.util.Scanner;

public class revnum {

    static int sum=0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rev=n%10;
        sum=sum*10+rev;
        rev1(n/10);
    }

    static int rev2(int n){
        int digit=(int)Math.log10(n)+1;
        return helper(n,digit);
    }
    private static int helper(int n,int digit){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digit-1)+helper(n/10,digit-1);
    }
    public static void main(String[] args) {
//       rev1(2341);
//        System.out.println(sum);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        System.out.println(rev2(4321));
        if (n==rev2(n)){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }
}
