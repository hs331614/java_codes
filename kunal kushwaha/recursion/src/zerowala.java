public class zerowala {
    public static void main(String[] args) {
        int num=14;
        System.out.println(numz(num, 0));
    }

            static int numz(int num,int z){
                if(num==0){
                    return z;
                }
                if(num%2==0){
                    return numz(num/2,z++);
                }
                else{
                    return numz(--num,z++);
                }
            }
        }
