import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number of rows :");
        int one=sc.nextInt();
        System.out.println("number of coloumns : ");
        int two=sc.nextInt();
        System.out.println("int of arrray");
        int[][] arr=new int[one][two];
        for (int i = 0; i <one; i++) {
            for (int j = 0; j < two; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

//        System.out.println("your current array"+ Arrays.toString(arr));
        boolean flag=false;
        System.out.println("target : ");
        int target=sc.nextInt();
        for (int k = 0; k < one; k++) {
            for (int l = 0; l < two; l++) {
                if (target==arr[k][l]){
                    flag=true;
                    break;
                }
            }
        }
        if (flag){
            System.out.println("number found!! B)");
        }
        else{
            System.out.println("number not found!! :(");
        }
//        (flag)?System.out.println("number found!! :)"):System.out.println("number not found!! :(");
    }
}
