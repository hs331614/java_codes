import java.util.Scanner;

public class odddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n*5);
        System.out.println(s);
        if(s.charAt(s.length()-1)=='0'){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
