import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arr2d {
    public static void main(String[] args) {
//        int[][] a2d=new int[3][];
//        int[][] a2d1= {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        Scanner sc = new Scanner(System.in);

        int[][] a2d = new int[3][3];

        for (int row = 0; row < a2d.length; row++) {
            for (int col = 0; col < a2d[row].length; col++) {
                a2d[row][col] = sc.nextInt();
            }
        }

//        for (int row = 0; row < a2d.length; row++) {
//            for (int col = 0; col < a2d[row].length; col++) {
//                System.out.print(a2d[row][col]+" ");
//            }
//            System.out.println("");
//        }

        for (int row = 0; row < a2d.length; row++) {

            System.out.print(Arrays.toString(a2d[row]));

            System.out.println(" ");
        }


    }
}

