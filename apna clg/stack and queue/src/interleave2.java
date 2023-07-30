import java.util.LinkedList;
import java.util.Queue;

public class interleave2 {
    public static Queue<Integer> interleave(Queue<Integer> q){
        Queue<Integer> q1=new LinkedList<>();
        int size=q.size();
        for (int i = 0; i < size/2; i++) {
            q1.add(q.remove());
        }
        for (int i = 0; i < size/2; i++) {
            q.add(q1.remove());
            q.add(q.remove());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for (int i = 1; i < 11; i++) {
            q.add(i);
        }
        revqueuem rev=new revqueuem();
        System.out.println(rev.revqueuem(q));
    }
}
