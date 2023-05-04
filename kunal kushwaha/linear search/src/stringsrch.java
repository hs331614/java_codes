public class stringsrch {
    public static void main(String[] args) {
        String name="Harshit";
        char target= 's' ;
        System.out.println(search(name,target));

    }

    static boolean search(String str,char chr ){
        if (str.length()==0){
            return false;
        }

        for (int i = 0; i <str.length() ; i++) {
            if (chr == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
