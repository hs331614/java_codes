public class sumofdigit {
    public static void main(String[] args) {
        System.out.println(sod(4352));
    }

    static int sod(int n){
        if (n==0){
            return 0;
        }
        return n%10+sod(n/10);
    }
}
