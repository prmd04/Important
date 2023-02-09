package HashMap.Stack.SlidingWindow;
import java.util.*;
public class MaxSubArraywithSizek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxsub(arr,k));
    }
    public static int maxsubarr(int arr[],int k){
        int max_sum=0;
        int curr_sum=0;
        for(int i=0;i<k;i++){
            curr_sum+=arr[i];
        }
        max_sum=curr_sum;
        for(int i=k;i<arr.length;i++){
            curr_sum=curr_sum-arr[i-k]+arr[i];
            max_sum=Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }
    public static int maxsub(int arr[],int k){
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        int i=0,j=0;
        while(j<arr.length){
            sum+=arr[j];
            if((j-i)+1<k){
                j++;
            }
            else if(((j-i)+1==k)){
                max_sum=Math.max(max_sum,sum);
                sum=sum-arr[i];
                i++;j++;
            }
        }
        return max_sum;
    }
}
