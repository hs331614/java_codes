import java.util.Scanner;

public class length_oF_strinf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="Radhika";
        int len=0;
        while(true){
            if(s.charAt(len)=='\0'){
                break;
            }
            len++;
            System.out.println(len);
        }
//        System.out.println(len);
    }
}
