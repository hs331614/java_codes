import java.util.Arrays;

public class flipping_an_image {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        for(int i=0;i<image.length;i++){
            int leni=image[i].length;
            for(int j=0;j<leni;j++){
                image[i][j]=~image[i][j];
            }
//            for (int j = 0; j < image.length; j++) {
//                System.out.println(Arrays.toString(image[j]));
//            }
            for(int k=0;k<leni/2;k++){
                image[i][k]=image[i][k]^image[i][leni-1-k];
                image[i][leni-1-k]=image[i][k]^image[i][leni-1-k];
                image[i][k]=image[i][k]^image[i][leni-1-k];

            }
        }
        for (int j = 0; j < image.length; j++) {
            System.out.println(Arrays.toString(image[j]));
        }
    }
}
