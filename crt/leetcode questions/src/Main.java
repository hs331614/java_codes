import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 6);

        int lowerIndex = Collections.binarySearch(list, 5);

        System.out.println(lowerIndex);

    }
}