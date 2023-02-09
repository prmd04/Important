package SlidingWindow;

import java.util.Scanner;

public class LongestSubarrayOfszek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k=sc.nextInt();

        System.out.println(longsub(arr,k));
    }
    public static int longsub(int arr[],int k){
        int count=0;
        int sum=0;
        int j=0;
        int i=0;
        while(i<arr.length||j<arr.length){
            while(sum<k){
                sum+=arr[i];
                i++;
            }
            while(sum>=k){
                count=Math.max(count,(i-j));
                sum-=arr[j];
                j++;
            }
        }
        return count;
    }
}
