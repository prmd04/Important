package HashMap.Stack.SlidingWindow;
import java.util.*;
public class Rahulandsubarry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println(minarr(n,k,arr));
    }

    private static int minarr(int n, int x, int[] arr) {
        int len=Integer.MAX_VALUE;
        int w_sum=0;
        int j=0;// track the first element
        for(int i=0;i<n;i++){
            w_sum+=arr[i];
            while(w_sum>x && j<=i){
                len=Math.min(len,(i-j)+1);
                w_sum-=arr[j];// subtract first element
                j++;
            }
        }
        if(len==Integer.MAX_VALUE){
            return 0;
        }
        return len;
    }
}
