public class happy_number_202 {
    public boolean isHappy(int n) {
    int f=n;
    int s=n;
    do {
        f=summul(summul(f));
        s=summul(s);
        if (s==1){
            return true;
        }
    }while (f!=s);
    return false;

    }

    public int summul(int n){
        int ans=0;
        while (n!=0){
            int rem=n%10;
            ans+=rem*rem;
            n/=10;
        }
        return ans;
    }
}
