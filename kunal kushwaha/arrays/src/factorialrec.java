import java.util.Scanner;

public class factorialrec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("press y to find factorial,n to not");
        String in= sc.next();
        while(in.equals("y")) {
            int n = sc.nextInt();
            System.out.println(fact(n));
            System.out.println("press y to find factorial,n to not");
            in= sc.next();
        }
            return ;
    }

    static int fact (int n){
        if(n<=1){
            return 1;
        }
        return n * fact(n-1);
    }
}
