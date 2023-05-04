public class oneton {
    public static void main(String[] args) {
        funrev(2);
//        funst(2);

    }

    static void funst(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funst(n-1);
    }

    static void funrev(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funrev(n-1);
        System.out.println(n);
    }
}
