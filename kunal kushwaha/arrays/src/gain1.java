public class gain1 {
    public static void main(String[] args) {
        int[] gain={28,0,-8,-99,11,62,-35,68,2,12,-71,13,66,-28};
        int max=0;
        int nor=0;
        for(int i=0;i<gain.length;i++){
            nor=nor+gain[i];
            if(max<nor){
                max=max^nor;
                nor=max^nor;
                max=max^nor;
            }
        }
        System.out.println(max);
    }
}
