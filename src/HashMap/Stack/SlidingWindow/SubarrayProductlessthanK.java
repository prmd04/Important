package HashMap.Stack.SlidingWindow;
import java.util.*;
public class SubarrayProductlessthanK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;//sc.nextInt();
        int arr[]={10,5,2,5};//new int[n];
        //for(int i=0;i<n;i++){
         //   arr[i]=sc.nextInt();
        //}
        int x=100;//sc.nextInt();
        System.out.println(subarr(arr,x));
    }
    public static int subarr(int arr[],int k) {
//        int i = 0;
//        int j = 1;
//        long product = arr[0];
//        int count = 0;
//        while (i <= j && j <= arr.length) {
//            if (product < k) {
//                count += j - i;
//                if (j < arr.length) product *= arr[j];
//                j++;
//            } else {
//                product /= arr[i++];
//            }
//        }
//        return count;
//    }
        int count = 0;
        int start = 0;

        int product = 1;
        for (int end = 0; end < arr.length; end++) {
            product *= arr[end];
            while (start < end && product >= k) {
                product /= arr[start];
                start++;
            }
            if (product < k) {
                count += end - start + 1;
            }
        }
        return count;
    }
}
