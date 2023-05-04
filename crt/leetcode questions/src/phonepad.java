import java.util.ArrayList;
import java.util.Arrays;

public class phonepad {
    public static void main(String[] args) {
//        phone("","234");
        System.out.println(phonearr("","234"));
    }

//    static void phone(String p,String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        int digit=up.charAt(0)-'0';
//        for (int i = (digit-1)*3; i <digit*3 ; i++) {
//            char ch=(char)('a'+i);
//            phone(p+ch,up.substring(1));
//
//        }
//
//    }


    static ArrayList<String> phonearr(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(phonearr(p + ch, up.substring(1)));
        }
        return list;
    }
}
