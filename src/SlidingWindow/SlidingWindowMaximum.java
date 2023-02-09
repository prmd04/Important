/*Input: A[] = {1, 3, -1, -3, 5, 3, 6, 7}, K = 3
Output: {3, 3, 5, 5, 6, 7}
*/
package SlidingWindow;
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
        System.out.println(Arrays.toString(maxSlidingWindow(arr,k)));
    }
    public static int[] maximumInWindow(int n,int k,int arr[]){
        int ans[]=new int[n-k+1];
        int ind=0;
        Deque<Integer>dq=new LinkedList<>();
        int i;
        for( i=0;i<k;i++){
            // check if in dq last is less than element then remove it
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(;i<n;i++){
            ans[ind++]=arr[dq.peek()];

            //  removing element from the window
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ans[ind++]=arr[dq.peek()];
        return ans;

    }
    static int[] maxSlidingWindow(int[] arr, int k)
    {
        int ans[]=new int[arr.length-k+1];
        int idx=0;
        Deque<Integer>dq=new LinkedList<>();

        for(int j=0;j<k;j++){
            while(!dq.isEmpty() && arr[j]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(j);
        }
        int i=k;
        while(i<arr.length){
            ans[idx++]=arr[dq.peek()];
            if(!dq.isEmpty() && dq.peekFirst()<(i-k+1)){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[i]>arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            i++;
        }
        ans[idx++]=dq.peekFirst();
        return ans;
    }
}

/*
Time Complexity:O(N) where N is the size of the array A[].
Space Complexity:O(N), as extra space is used
*/