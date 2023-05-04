public class panagram {
    public static void main(String[] args) {
        String sentence="anmt";
        boolean flag=false;
        for(int i=97;i<123;i++){
            for(int j=0;j<sentence.length();j++){
                if((char)(i)==sentence.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
