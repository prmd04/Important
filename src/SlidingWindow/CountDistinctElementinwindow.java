package SlidingWindow;
import java.util.*;
public class CountDistinctElementinwindow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(countElement(arr,k,n));
    }

    private static ArrayList<Integer> countElement(int[] arr, int k, int n) {
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        int i;
        for(i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(;i<n;i++){
            list.add(map.size());
            if(map.get(arr[i-k])==1){
                map.remove(arr[i-k]);
            }
            else
                map.put(arr[i-k],map.getOrDefault(arr[i-k],0)-1);

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        list.add(map.size());
        return list;
    }
}
