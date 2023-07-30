import java.util.HashMap;
import java.util.Set;

public class trailhm {

    public static void main(String[] args) {
        int arr[]={2,1,2,2,3,2,4,4,3,2,0,2,4,3,6,7};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }else {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        Set<Integer> rep=hm.keySet();
        for (int r:rep) {
            System.out.println(r+" -> "+ hm.get(r));
        }
    }
}
