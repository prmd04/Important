/*Input : arr[] = {-8, 2, 3, -6, 10}, k = 2
Output : -8 0 -6 -6
*/
package SlidingWindow;
import java.util.*;
public class FirstNegativeNumberinwindowSizeK {
    public static void main(String[] args) {
        int arr[]={10, -1, -5, 7, -15, 20, 18, 24};
        int k=3;
        System.out.println(firstneg(arr,k));
    }

    private static ArrayList<Integer> firstneg(int[] arr, int k) {
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        int i;
        for(i=0;i<k;i++){ // for window size;
            if(arr[i]<0){
                q.add(i);
            }
        }
        for(;i<n;i++){   // for full size;
            if(q.isEmpty()){
                list.add(0);
            }
            else
                list.add(arr[q.peek()]);
            if(!q.isEmpty() && q.peek()==i-k){ // remove element from window
                q.remove();
            }
            if(arr[i]<0){        // add element from window
                q.add(i);
            }
        }
        if(q.isEmpty()) list.add(0); // for last element
        else list.add(arr[q.peek()]);
        return list;
    }

}

/*
Time Complexity:O(N) where N is the size of the array A[].
Space Complexity:O(N), as extra space is used
*/