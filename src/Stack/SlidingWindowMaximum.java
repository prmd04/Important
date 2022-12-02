package Stack;
import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int[]nge=nextGreater(arr);
        int j=0;
        for(int i=0;i<=n-k;i++){
            if(j<i){
                j=i;
            }
            while(nge[j]<i+k){
                j=nge[j];
            }
            System.out.print(arr[j] + " ");
        }
    }
    static int[] nextGreater(int arr[]){
        Stack<Integer>st=new Stack<>();
        int n=arr.length;
        int ans[]=new int[n];
        st.push(n-1);
        ans[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=n;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}
