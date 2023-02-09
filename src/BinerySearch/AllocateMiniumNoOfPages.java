package BinerySearch;

import java.util.Scanner;

public class AllocateMiniumNoOfPages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(findPages(arr, m));
    }

    public static boolean isPossible(int arr[], int mid, int m) {
        int sum=0;
        int student=1;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum>mid){
                student++;
                sum=arr[i];
            }
        }
        return student<=m;
    }

    public static int findPages(int arr[],int m) {
        int max = -1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int low = max;
        int high = sum;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, mid, m) == true) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

}