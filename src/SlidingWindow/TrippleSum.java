package SlidingWindow;
import java.util.*;
public class TrippleSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(triplesum(arr,target));
    }
    public static int triplesum(int arr[],int target){
        Arrays.sort(arr);//sort the array
        int counter = 0;
        int n=arr.length;

        for (int i = 0; i < n - 2; i++)
        {
            int j = i + 1, k = n - 1;
            while (j < k)
            {
                if (arr[i] + arr[j] + arr[k] >= target)
                    k--;
                else
                {
                    counter += (k - j);
                    j++;
                }
            }
        }
        return counter;
    }
}
