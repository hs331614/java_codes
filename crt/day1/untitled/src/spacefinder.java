public class spacefinder {
    public static void main(String[] args) {
        System.out.println(word_count("my name is harshit"));
        System.out.println(check("abhigya", "abhigya"));
        System.out.println(check("abhigya",rev("abhigya")));
        System.out.println(pattern("abhigya","igyn"));
        System.out.println(rev("abhigya"));

    }

    static int word_count(String s) {
        int l = s.length();
        int count = 0;
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        return count + 1;
    }

    static boolean check(String a, String b) {
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    static String rev(String a){
        String b="";
        for (int i = 0; i < a.length(); i++) {
            b+=a.charAt(a.length()-i-1);
        }
        return b;
    }

    static int pattern(String main,String part){
        for (int i = 0; i < main.length()-part.length(); i++) {
            for (int j = 0; j <part.length() ; j++) {
                if (main.charAt(i+j)!=part.charAt(j)){
                    break;
                }
                if (j==part.length()-1){
                    return i;
                }
            }

        }
        return -1;
    }

    static 
}