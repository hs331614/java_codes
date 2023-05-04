public class ipadd {
    public static void main(String[] args) {
            String address="1.1.1.1";
            String rep="";
            for(int i=0;i<address.length();i++){
                char j=address.charAt(i);
                if(address.charAt(i)=='.'){
                    rep.concat("[.]");
                }
                else{
                    rep.concat("j");
                }
            }
        System.out.println(rep);
        }
    }

