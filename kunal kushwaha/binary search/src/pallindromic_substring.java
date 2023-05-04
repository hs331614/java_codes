import java.util.Scanner;

public class pallindromic_substring {
    public static void main (String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            String a=sc.next();
            String b=sc.next();
            boolean st=false;
            for (int i=0;i<a.length() ;i++ ){
                for (int j=i;j<b.length() ;j++ ){
                    if (a.charAt(i)==b.charAt(j)){
                        st=true;
                        break;
                    }
                }
            }
            if (st){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }

            T--;}
    }
}
