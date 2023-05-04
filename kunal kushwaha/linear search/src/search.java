public class search {

    public static void main(String[] args) {
        int[] arr = {1, 24, 54, 32, 65, 342, 5, 2, 24};
        int ans=linsrch(arr, 88);
        System.out.println(ans);
    }

    static int linsrch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;
    }
}
