import java.util.ArrayList;
import java.util.Arrays;

public class linerasearchre {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,3,7,19,19};
        System.out.println(lin(arr,7,0));
//        findind(arr,19,0);
//        System.out.println(list);
        System.out.println(findindarr(arr,19,0,new ArrayList<>()));
    }

    static int lin(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return lin(arr,target,++index);
        }
    }

    static ArrayList<Integer> list=new ArrayList<>();
    static void findind(int[] arr,int target,int index){
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add(index);
        }
            findind(arr,target,++index);
    }

    static ArrayList findindarr(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findindarr(arr,target,++index,list);
    }
}
