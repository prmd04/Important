package HashMap;
import java.util.*;

public class FindPairswithdiffK {
    public static void main(String[] args) {
        int arr[]={1,5,4,1,2};
        int k=0;
        int ans=mp(arr,k);
        System.out.println(ans);
    }

    private static int findpair(int[] arr, int k) {
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.containsKey(i-k) && k>0){  // if k is greater than 0 and map conains key + k
                count++;
            }
            else if(k==0 && map.get(i)>1){ // uif k is 0 then we have to find duplicate ;
                count++;
            }
        }
        return count;
    }
    public static int mp(int arr[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(k==0 && map.get(arr[i])>1){
                count++;
            }
            if(k!=0 && map.containsKey(arr[i]+k)){
                count+=map.get(arr[i]+k);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count;
    }

}
