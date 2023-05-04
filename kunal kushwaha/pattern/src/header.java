import java.util.Scanner;

public class header {

//    public Test
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        System.out.println(pos(n));
//        System.out.println(pointadd(9.234));
        System.out.println(avg(2.56f,3.674f,7.3456f));
    }


    static int pos(int r) {
        if (r>0){
            return r;
        }else{
            return r*-1;
        }
    }
    
    static int pointadd(double r){
        int m= (int)r;
        double z=r-m;
        int sum=0;
        for (int i = 0; i < 16; i++) {
            int ans=(int)(z*10);
            sum=sum+ans;
        }
        return sum;
    }

    static float avg(float a1,float a2,float a3){
        float r=a1+a2+a3;
        return r;
    }

}