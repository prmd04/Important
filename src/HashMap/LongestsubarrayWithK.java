package HashMap;
import java.util.*;
public class LongestsubarrayWithK {
    public static void main(String[] args) {
        int arr[]={1,3,4,2,1};
        int k=10;
        System.out.println(longest(arr,k));
    }
    public static int longest(int arr[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=1;
        int maxcount=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                if(count>maxcount)maxcount=count;
                count=1;
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);

            }
            else{
                map.put(sum,1);
                count++;
            }
        }
        return maxcount;
    }
}
