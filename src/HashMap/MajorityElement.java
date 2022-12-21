package HashMap;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,1,5,1};
        int num[]={1,2};
        majority(num);

    }
    public static void majority(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
    }
}
