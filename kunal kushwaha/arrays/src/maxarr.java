public class maxarr {
    public static void main(String[] args) {
        int[] arr={1,23,547,234,6,55,321};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int MAX=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(MAX<arr[i]){
                MAX=arr[i];
            }
        }
        return MAX;
    }
}
