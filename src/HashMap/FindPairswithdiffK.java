package HashMap;
import java.util.*;

public class FindPairswithdiffK {
    public static void main(String[] args) {
        int arr[]={1,4,4,5,5,5,6,6,11};
        int k=11;
        System.out.println(findpair(arr,k));
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
}
