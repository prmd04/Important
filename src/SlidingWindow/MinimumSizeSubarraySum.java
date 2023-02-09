package SlidingWindow;
import java.util.*;
public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println(minsub(arr,k,n));
    }
    public static int minsub(int arr[],int k,int n){
        int size=arr.length+1;
        int j=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum>=k){
                size=Math.min(size,(i-j)+1);
                sum-=arr[j];
                j++;
            }
        }
        return size;
    }
}
/*
Time Complexity 0(n) size of Array[]
Space Complexity 0(1). No extra space used
*/
