import java.util.Arrays;
import java.util.Comparator;

public class max_chain {
    public static void main(String[] args) {

        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));


        int length=1;
        int end=pairs[0][1];
        for (int i = 0; i < pairs.length; i++) {
            if (end<=pairs[i][0]){
                length++;
                end=pairs[i][1];
            }
        }
        System.out.println("length = "+ length);
    }
}
