import java.util.*;

public class push_at_bottom {

    static class stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //push
        public static void push(int n){
            list.add(n);
        }
        //pop
        public static int pop(){
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
        }
        public static int peek(){
            return list.get(list.size()-1);
        }
    }



    public static void pushb(Stack<Integer> s,int n){
        if (s.isEmpty()){
            s.push(n);
            return;
        }
        int t =s.pop();
        pushb(s,n);
        s.push(t);

    }
    public static String revstring(String st){
        Stack<Character> s=new Stack<>();
        for (int i = 0; i < st.length(); i++) {
            s.push(st.charAt(i));
        }
        StringBuilder newst=new StringBuilder();
        while (!s.isEmpty()){
            newst.append(s.pop());
        }

        return newst.toString();
    }

    public static void main(String[] args) {

//        Stack<Integer> s=new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//
//        pushb(s,4);
//        while (!s.isEmpty()){
//            System.out.println(s.pop());
//        }

        String st="Harshit";
        System.out.println(revstring(st));
    }
}
