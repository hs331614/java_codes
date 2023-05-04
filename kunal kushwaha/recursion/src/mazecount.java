import java.util.ArrayList;

public class mazecount {
    public static void main(String[] args) {
//        System.out.println(count(2,2));
//        path("",3,3);
//        System.out.println(patharr("",3,3));
        System.out.println(patharrdia("",3,3));
    }

    static int count(int r, int d){
        if(r==1||d==1){
            return 1;
        }
        int right=count(r-1,d);
        int down=count(r,d-1);
        return right+down;
    }

    static void path(String p,int r,int d){
    if(r==1&&d==1){
        System.out.println(p);
        return;
    }
    if (r>1){
        path(p+'R',r-1,d);
    }
    if (d>1){
        path(p+'D',r,d-1);
    }
    }

    static ArrayList<String> patharr(String p, int r, int d){
        if(r==1&&d==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        if (r>1){
            list.addAll(patharr(p+'R',r-1,d));
        }
        if (d>1){
            list.addAll(patharr(p+'D',r,d-1));
        }
        return list;
    }

    static ArrayList<String> patharrdia(String p, int r, int d){
        if(r==1&&d==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        if (r>1){
            list.addAll(patharrdia(p+'R',r-1,d));
        }
        if (d>1&&r>1){
            list.addAll(patharrdia(p+'X',r-1,d-1));
        }
        if (d>1){
            list.addAll(patharrdia(p+'D',r,d-1));
        }
        return list;
    }
}
