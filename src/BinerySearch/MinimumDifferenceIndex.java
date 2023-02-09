package BinerySearch;

import java.util.Scanner;

public class MinimumDifferenceIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(mindifind(arr,n,target));
    }
    public static int mindifind(int arr[],int n,int target){
        if(arr[0]>target){
            return arr[0];
        }
        if(arr[n-1]<target){
            return arr[n-1];
        }
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return arr[mid];
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if((arr[low]-target)>target-arr[high]){
            return arr[high];
        }
        return arr[low];
    }
}
