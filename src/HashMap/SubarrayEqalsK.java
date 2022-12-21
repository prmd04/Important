package HashMap;
import java.util.*;
public class SubarrayEqalsK {
    public static void main(String[] args) {
        int arr[]={1,4,4,5,5,5,6,6,11}; // ans=3
        int k=11;
        System.out.println(subarrEk(arr,k));
    }
    public static int subarrEk(int arr[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int ans=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }

            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return ans;
    }
}
