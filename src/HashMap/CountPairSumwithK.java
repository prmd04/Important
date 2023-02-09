package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CountPairSumwithK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(countpair(arr,k));
    }
    public static int countpair(int arr[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(k-arr[i])){
                ans+=map.get(k-arr[i]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return ans;
    }
}
