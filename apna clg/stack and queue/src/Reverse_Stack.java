import java.util.Stack;

public class Reverse_Stack {
    public static void pushb(Stack<Integer> s,int n){
        if (s.isEmpty()){
            s.push(n);
            return;
        }
        int t =s.pop();
        pushb(s,n);
        s.push(t);

    }
    public  void Reverse_Stack(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int temp=s.pop();
        Reverse_Stack(s);
        pushb(s,temp);
    }
}
