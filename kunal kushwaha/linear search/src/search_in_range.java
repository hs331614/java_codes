public class search_in_range {
    public static void main(String[] args) {
        int[] arr={2,3,413,45,76,4,34,23,654,77,33,23,554,3};
        int target=34;

        System.out.println(srchrange(arr,1,10,target));

    }

    static int srchrange(int[] arr,int start,int end,int target){
        if (arr == null) {
            return -1;
        }

        for (int i = start; i <=end ; i++) {
            if (target == arr[i]) {
                return i;
            }

        }
        return -1;
    }
}
