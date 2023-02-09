package HashMap;
import java.util.*;
public class LongestsubarrayWithK {
    public static void main(String[] args) {
        int arr[]={8,2,15,25,1,8,-8,7,6,11,23,2};
        int k=25;
        System.out.println(longest(arr,k));
    }
    public static int longest(int arr[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int maxlen=1;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                int idx=map.get(sum-k);//previous index
                int len=i-idx;
                if(maxlen<len) maxlen=len;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }
        return maxlen ;
    }
}
