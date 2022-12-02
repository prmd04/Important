package SlidingWindow;
//leet code quetion 239
import java.util.*;
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(Arrays.toString(maximum(arr,k)));

    }
    public static int[] maximum(int arr[],int k){
        int ans[]=new int[arr.length-k+1];
        int i=0;
        int j=k-1;
        while(j<arr.length){
            int max=Integer.MIN_VALUE;
            for(int p=i;p<=j;p++){
                if(max<arr[p]){
                    max=arr[p];
                }
            }
            ans[i]=max;
            i++;
            j++;
        }
        return ans;
    }
}
