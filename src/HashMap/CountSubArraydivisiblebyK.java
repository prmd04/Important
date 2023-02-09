package HashMap;

import java.util.HashMap;

// if divisible is come we have to take reminder

public class CountSubArraydivisiblebyK {
    public static void main(String[] args) {
        int arr[]={4,5,0,-2,-3,1};
        int k=5;
        int ans=count(arr,k);
        System.out.println(ans);
    }
    public static int count(int arr[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int rem=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            rem=sum%k;
            // special case if rem negative
            if(rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
                map.put(rem,map.get(rem)+1);
            }
            else{
                map.put(rem,1);
            }
        }
        return count;
    }
}
//tc 0(n)