public class Q1491 {
    public static void main(String[] args) {
        int[] salary={48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(average(salary));
    }

    private static double average(int[] salary) {
        int min= Integer.MAX_VALUE;
        int max=0;
        int n=salary.length;
        double sum=0;
        for (int i = 0; i < n; i++) {
            if(salary[i]>max){
                max=salary[i];
            }
            if (salary[i]<min){
                min=salary[i];
            }
        }
        sum=(double)0-min-max;
        for (int i = 0; i < n; i++) {
            sum=(double)sum+(double)salary[i];
        }
        return sum/(n-2);
    }
}
