
import  java.util.*;

public class min_max
{
public static void main(String args[])
{

    int[] arr = {5,3,4,14,12};
    int mini= arr[0];
    for(int i=0;i<5;i++)
    {
       if(mini>arr[i]){
           mini = arr[i];
       }
    }
    int tar =

    int start = 0;
    int end = 5-1;
    while(start<end)
    {
        int temp;
        temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }

    System.out.println(mini);
}
}
