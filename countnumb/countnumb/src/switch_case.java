import java.util.Scanner;
public class switch_case {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();

        switch(i){
            case 1 :{
                System.out.println("monday");
            }
                break;
            case 2:{
                System.out.println("tuesday");
            }
            break;

            default:
                System.out.println("something");
        }
    }
}
