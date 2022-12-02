package BinerySearch;

import java.util.Scanner;

public class MinBallInTheBag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int opreation=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        System.out.println(minimumSize(arr,opreation));
    }
    public static int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = 0;
        for(int n: nums)
            right = Math.max(right, n);

        while(left < right)
        {
            int mid = left + (right - left)/2;
            if(helper(mid, nums, maxOperations))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    private static boolean helper(int mid, int[] nums, int capacity)
    {
        int count = 0;
        for(int n: nums)
        {
            count += (n-1)/mid;
            if(count > capacity) return false;
        }
        return true;
    }
}

