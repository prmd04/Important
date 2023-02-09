package SlidingWindow;
import java.util.*;
public class MaxsumsubarrayOfsizeK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            arr.add(temp);
        }
        
        System.out.println(maximumSumSubarray(k,arr,n));

    }// k is window size
    static long maximumSumSubarray(int K, ArrayList<Integer> arr,int N){
        long ans=0,sum=0;
        for(int i=0;i<K;i++){
            sum+=arr.get(i);
        }
        for(int i=K;i<N;i++){
            ans=Math.max(ans,sum);
            sum = (sum + arr.get(i)) - arr.get(i - K);
        }
        ans=Math.max(ans,sum);
        return ans;
    }
}
/* Time Complexity:O(N) where N is the size of the array A[].
   Space Complexity:O(1), no extra space is used
 */