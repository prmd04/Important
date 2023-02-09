package BinerySearch;

import java.util.Scanner;

public class SearchInNearlySortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(nearlysort(arr,n,target));
    }
    public static int nearlysort(int arr[],int n,int target){
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=low + (high-low)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(mid>0 && arr[mid-1]==target){
                return mid-1;
            }
            if(mid<n-1 && arr[mid+1]==target){
                return mid+1;
            }
            if(arr[mid]<target){
                low=mid+2;
            }
            else{
                high=mid-2;
            }
        }
        return -1;
    }

}
