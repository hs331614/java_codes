import java.util.Scanner;

public class abspace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for (int j = 0; j < i+1; j++) {
//                char y='A'+i-1;
                System.out.print((char)('A'+j));
            }
            for (int k = 0; k < 2*(n-i); k++) {
                System.out.print(" ");
            }
            for (int z = i+1; z >0; z--) {
                System.out.print((char)('A'+z-1));
            }
            System.out.println("");
        }
    }
}
