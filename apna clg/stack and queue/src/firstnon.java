import java.util.LinkedList;
import java.util.Queue;

public class firstnon {
    public static void monrep(String str) {
        int freq[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char s=str.charAt(i);
            q.add(s);
            freq[s-'a']++;
            while (!q.isEmpty()&&freq[q.peek()-'a']>1){
                q.remove();
            }
            if (q.isEmpty()){
                System.out.print(-1+" ");
            }
            else {
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str="aabccxb";
        monrep(str);
        }
    }