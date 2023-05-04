import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
       sub("","abcd");
        System.out.println( substr("","abcd"));
    }

    static void sub(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c=up.charAt(0);
        sub(c+p,up.substring(1));
        sub(p,up.substring(1));
    }

    static ArrayList<String> substr(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;

        }

        char ch=up.charAt(0);
        ArrayList<String> left=substr(ch+p,up.substring(1));
        ArrayList<String> right=substr(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
